# Amazon Backend MVP

Spring Boot MVP for the ENORM REF Amazon scenario, now using Maven, JWT authentication and a persistent H2 database.

## Tech stack

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security
- H2 file database
- JWT (JJWT)

## Generation Gap structure

- `pt.isep.enorm.ref.domain.generated`: generated/common JPA base classes
- `pt.isep.enorm.ref.domain`: handwritten extension entities
- `pt.isep.enorm.ref.repository.generated`: generated/common repositories
- `pt.isep.enorm.ref.repository`: handwritten repository extension points
- `pt.isep.enorm.ref.service.generated`: generated/common service logic
- `pt.isep.enorm.ref.service`: handwritten service extension points
- `pt.isep.enorm.ref.web.generated`: generated/common REST endpoints
- `pt.isep.enorm.ref.web`: handwritten controller/error extension points

## Run

```powershell
mvn -f part2\ai-generated-backends-prototypes\amazon-backend\pom.xml spring-boot:run
```

## H2 database

- Application port: `8081`
- H2 console: `http://localhost:8081/h2-console`
- JDBC URL to use in the console: `jdbc:h2:file:./data/amazonappdb`
- User: `sa`
- Password: empty

The application also starts the H2 TCP server on port `9092`.

## Authentication flow

Requests accept domain entities directly. Only the fields shown below are required.

Register:

```http
POST /api/auth/register
Content-Type: application/json

{
  "username": "atb",
  "password": "atb"
}
```

Example response:

```json
{
  "token": "<jwt>",
  "username": "atb",
  "role": "BUYER"
}
```

To promote the user to seller directly in H2:

```sql
UPDATE users SET role = 'SELLER' WHERE username = 'atb';
```

Login:

```http
POST /api/auth/login
Content-Type: application/json

{
  "username": "atb",
  "password": "atb"
}
```

## Products API

List products:

```http
GET /api/products
```

Create product (`SELLER`):

```http
POST /api/products
Authorization: Bearer YOUR_JWT_TOKEN
Content-Type: application/json

{
  "name": "tv",
  "description": "wide screen tv",
  "price": 299.99
}
```

## Reviews API

Submit review (`BUYER` or `GENERIC`):

```http
POST /api/reviews
Authorization: Bearer YOUR_JWT_TOKEN
Content-Type: application/json

{
  "comment": "Great product and fast delivery!",
  "grade": 5,
  "product": {
    "id": 14
  }
}
```

Equivalent product-scoped endpoint (product id comes from the path):

```http
POST /api/products/14/reviews
Authorization: Bearer YOUR_JWT_TOKEN
Content-Type: application/json

{
  "comment": "Great product and fast delivery!",
  "grade": 5
}
```

Optional `mediaReferences` is also supported:

```json
"mediaReferences": [
  {
    "mediaType": "PHOTO",
    "url": "https://example.org/review-photo.jpg"
  }
]
```

Get average stars for a product:

```http
GET /api/products/14/average-rating
```

Only approved reviews are counted in the average. Non-verified buyers create reviews with `status = PENDING` and `verificationType = MANUAL`. Buyers verified by user flag or by an order containing the reviewed product create reviews with `status = APPROVED`, `verificationType = AUTOMATIC`, and `verifiedBuyerAtSubmission = true`.

## Moderation simulation

Moderation endpoints require a `MODERATOR` token. For local testing, promote a user in H2:

```sql
UPDATE users SET role = 'MODERATOR' WHERE username = 'atb';
```

The backend simulates review moderation with deterministic keyword signals:

- reviews containing blocked spam/toxicity signals are set to `REJECTED`;
- verified-buyer reviews are approved automatically when no blocked signal is found;
- pending manual reviews are approved by the simulated moderator when no blocked signal is found.

Run moderation against one review:

```http
POST /api/moderation/reviews/1/simulate
Authorization: Bearer MODERATOR_JWT_TOKEN
```

Process all pending reviews:

```http
POST /api/moderation/reviews/simulate
Authorization: Bearer MODERATOR_JWT_TOKEN
```

Example response:

```json
{
  "reviewId": 1,
  "moderator": "atb",
  "previousStatus": "PENDING",
  "newStatus": "APPROVED",
  "decision": "MANUAL_APPROVE_SIMULATED",
  "explanation": "Approved by simulated manual moderation; no blocked signal was found."
}
```
