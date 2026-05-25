REF-generated REST backend scaffold
Model: YouTube 3.2
Profile: media-feedback

Scope restriction:
This generator must only expose behavior that is explicitly present in the provided domain model and REF scenario text.
No extra platform behavior should be inferred beyond those artifacts.

Scenario summary:
Evaluated resources are videos; users comment videos, react with like/dislike, comments may thread, comments can be reported, and comments are commonly sorted by date or value.

Generated endpoints:
- /api/channels
- /api/contents
- /api/videos
- /api/comments
- /api/likes
- /api/likeHistorys
- /api/reports
- /api/subscriptions
- /api/channelPermissionPolicys
- /api/contentValidationRules
- /api/videoModerationChecks
- /api/commentModerationChecks
- /api/commentSettingsChanges
