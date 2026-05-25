REF-generated REST backend scaffold
Model: Reddit 3.2
Profile: community-discussion

Scope restriction:
This generator must only expose behavior that is explicitly present in the provided domain model and REF scenario text.
No extra platform behavior should be inferred beyond those artifacts.

Scenario summary:
Users post in topic forums, reply in threads, upvote/downvote posts and comments, report posts and comments, and each topic has rules, moderators, and automation support.

Generated endpoints:
- /api/subreddits
- /api/contents
- /api/posts
- /api/comments
- /api/mediaAttachments
- /api/communityRules
- /api/participationPolicys
- /api/contentValidationRules
- /api/postModerationChecks
- /api/commentModerationChecks
- /api/votes
- /api/reports
- /api/subscriptions
