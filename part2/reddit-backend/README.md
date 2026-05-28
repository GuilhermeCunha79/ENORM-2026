# Reddit Backend MVP

Spring Boot MVP for the ENORM REF Reddit scenario, using Maven, JWT authentication, and a persistent H2 database.

## Tech stack

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security
- H2 file database
- JWT (JJWT)

## Generation Gap structure

- `pt.isep.enorm.ref.reddit.domain.generated`: generated/common JPA base classes
- `pt.isep.enorm.ref.reddit.domain`: handwritten extension entities
- `pt.isep.enorm.ref.reddit.repository.generated`: generated/common repositories
- `pt.isep.enorm.ref.reddit.repository`: handwritten repository extension points
- `pt.isep.enorm.ref.reddit.service.generated`: generated/common service logic
- `pt.isep.enorm.ref.reddit.service`: handwritten service extension points
- `pt.isep.enorm.ref.reddit.web.generated`: generated/common REST endpoints
- `pt.isep.enorm.ref.reddit.web`: handwritten controller/error extension points

## Run

```powershell
mvn -f part2\reddit-backend\pom.xml spring-boot:run
```

## H2 database

- Application port: `8083`
- H2 console: `http://localhost:8083/h2-console`
- JDBC URL to use in the console: `jdbc:h2:file:./data/redditappdb`
- User: `sa`
- Password: empty

The application also starts the H2 TCP server on port `9094`.

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

List subreddits:

```http
GET /api/subreddits
```

Create subreddit (`CREATOR`):

```http
POST /api/subreddits
Authorization: Bearer YOUR_JWT_TOKEN
Content-Type: application/json

{
  "name": "ENORM Subreddit",
  "description": "Model-driven content",
  "creationDate": "2026-05-12"
}
```

Create post (`CREATOR` and subreddit owner):

```http
POST /api/subreddits/1/posts
Authorization: Bearer YOUR_JWT_TOKEN
Content-Type: application/json

{
  "title": "Intro to REF",
  "description": "A short intro",
  "creationDate": "2026-05-14"
}
```

Create comment:

```http
POST /api/posts/1/comments
Authorization: Bearer YOUR_JWT_TOKEN
Content-Type: application/json

{
  "text": "Great post!"
}
```

Create vote:

```http
POST /api/votes?postId=1
Authorization: Bearer YOUR_JWT_TOKEN
Content-Type: application/json

{
  "value": "UPVOTE"
}
```

## Moderation simulation

Moderation endpoints require a `MODERATOR` token. For local testing, promote a user in H2:

```sql
UPDATE users SET role = 'MODERATOR' WHERE username = 'viewer1';
```

The backend simulates moderation using keyword lists and decisions defined in `refdsl/reddit.refdsl`:

- posts: copyright signals remove content, spam flags content, harmful-content signals move it to `UNDER_REVIEW`;
- comments: blocked words and toxicity hide/remove comments, spam flags comments;
- reports: pending reports are processed in batch and marked `REVIEWED` or `REMOVED`.

Run moderation against a post:

```http
POST /api/moderation/posts/1/simulate
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
  "targetType": "POST",
  "targetId": 1,
  "moderationCheckId": 4,
  "reportId": null,
  "signal": "spam-risk",
  "decision": "FLAGGED",
  "status": "FLAGGED",
  "explanation": "Spam-like signal found; simulated action flags the post."
}
```



