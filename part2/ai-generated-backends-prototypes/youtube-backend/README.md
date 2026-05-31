# YouTube Backend MVP

Spring Boot MVP for the ENORM REF YouTube scenario, using Maven, JWT authentication, and a persistent H2 database.

## Tech stack

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security
- H2 file database
- JWT (JJWT)

## Generation Gap structure

- `pt.isep.enorm.ref.youtube.domain.generated`: generated/common JPA base classes
- `pt.isep.enorm.ref.youtube.domain`: handwritten extension entities
- `pt.isep.enorm.ref.youtube.repository.generated`: generated/common repositories
- `pt.isep.enorm.ref.youtube.repository`: handwritten repository extension points
- `pt.isep.enorm.ref.youtube.service.generated`: generated/common service logic
- `pt.isep.enorm.ref.youtube.service`: handwritten service extension points
- `pt.isep.enorm.ref.youtube.web.generated`: generated/common REST endpoints
- `pt.isep.enorm.ref.youtube.web`: handwritten controller/error extension points

## Run

```powershell
mvn -f part2\ai-generated-backends-prototypes\youtube-backend\pom.xml spring-boot:run
```

## H2 database

- Application port: `8082`
- H2 console: `http://localhost:8082/h2-console`
- JDBC URL to use in the console: `jdbc:h2:file:./data/youtubeappdb`
- User: `sa`
- Password: empty

The application also starts the H2 TCP server on port `9093`.

## Authentication flow

Register:

```http
POST /api/auth/register
Content-Type: application/json

{
  "username": "viewer1",
  "password": "viewer1"
}
```

Example response:

```json
{
  "token": "<jwt>",
  "username": "viewer1",
  "role": "GENERIC"
}
```

Login:

```http
POST /api/auth/login
Content-Type: application/json

{
  "username": "viewer1",
  "password": "viewer1"
}
```

## Example APIs

List channels:

```http
GET /api/channels
```

Create channel (`CREATOR`):

```http
POST /api/channels
Authorization: Bearer YOUR_JWT_TOKEN
Content-Type: application/json

{
  "name": "ENORM Channel",
  "description": "Model-driven content",
  "creationDate": "2026-05-12"
}
```

Upload video (`CREATOR` and channel owner):

```http
POST /api/channels/1/videos
Authorization: Bearer YOUR_JWT_TOKEN
Content-Type: application/json

{
  "title": "Intro to REF",
  "description": "A short intro",
  "duration": 360
}
```

Create comment:

```http
POST /api/videos/1/comments
Authorization: Bearer YOUR_JWT_TOKEN
Content-Type: application/json

{
  "text": "Great video!"
}
```

Create like:

```http
POST /api/likes?videoId=1
Authorization: Bearer YOUR_JWT_TOKEN
Content-Type: application/json

{
  "value": "LIKE"
}
```

## Moderation simulation

Moderation endpoints require a `MODERATOR` token. For local testing, promote a user in H2:

```sql
UPDATE users SET role = 'MODERATOR' WHERE username = 'viewer1';
```

The backend simulates moderation with deterministic keyword signals:

- videos: copyright signals remove content, spam flags content, harmful-content signals move it to `UNDER_REVIEW`;
- comments: blocked words and toxicity hide/remove comments, spam flags comments;
- reports: pending reports are processed in batch and marked `REVIEWED` or `REMOVED`.

Run moderation against a video:

```http
POST /api/moderation/videos/1/simulate
Authorization: Bearer MODERATOR_JWT_TOKEN
```

Run moderation against a comment:

```http
POST /api/moderation/comments/1/simulate
Authorization: Bearer MODERATOR_JWT_TOKEN
```

Process all pending reports:

```http
POST /api/moderation/reports/simulate
Authorization: Bearer MODERATOR_JWT_TOKEN
```

Example response:

```json
{
  "targetType": "VIDEO",
  "targetId": 1,
  "moderationCheckId": 4,
  "reportId": null,
  "signal": "spam-risk",
  "decision": "FLAGGED",
  "status": "FLAGGED",
  "explanation": "Spam-like signal found; simulated action flags the video."
}
```
