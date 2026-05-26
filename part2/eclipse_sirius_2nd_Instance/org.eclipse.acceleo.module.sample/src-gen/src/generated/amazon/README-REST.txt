REF-generated REST backend scaffold
Model: Amazon 3.0
Profile: catalog-commerce
Port: 8081

Scope restriction:
This generator must only expose behavior that is explicitly present in the provided domain model and REF scenario text.
No extra platform behavior should be inferred beyond those artifacts.

Scenario summary:
Evaluated resources are bought products; users evaluate products with a five-star scale, text, optional photos/videos, and a verification process that may be manual or automatic.

Generated endpoints:
- POST /api/auth/register
- POST /api/auth/login
- GET /api/contexts
- GET /api/contexts/{contextId}
- POST /api/contexts
- PUT /api/contexts/{contextId}
- DELETE /api/contexts/{contextId}
- GET /api/products
- POST /api/products
- GET /api/products/{productId}/average-rating
- POST /api/products/{productId}/reviews
- POST /api/reviews
- GET /api/comments?productId={productId}
- GET /api/comments/{commentId}
- POST /api/comments?productId={productId}
- PUT /api/comments/{commentId}
- DELETE /api/comments/{commentId}
- GET /api/comments/{commentId}/votes
- POST /api/comments/{commentId}/votes
- DELETE /api/comments/{commentId}/votes/{voteId}
- POST /api/moderation/reviews/{reviewId}/simulate
- POST /api/moderation/reviews/simulate
- GET /h2-console
