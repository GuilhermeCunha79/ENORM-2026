REF-generated REST backend scaffold
Model: Amazon 3.0
Profile: catalog-commerce

Scope restriction:
This generator must only expose behavior that is explicitly present in the provided domain model and REF scenario text.
No extra platform behavior should be inferred beyond those artifacts.

Scenario summary:
Evaluated resources are bought products; users evaluate products with a five-star scale, text, optional photos/videos, and a verification process that may be manual or automatic.

Generated endpoints:
- /api/products
- /api/orders
- /api/orderItems
- /api/productReviews
- /api/mediaAttachments
- /api/helpfulVotes
- /api/verificationProcesss
- /api/reviewPolicys
- /api/reviewModerationChecks
- /api/ratingPolicys
