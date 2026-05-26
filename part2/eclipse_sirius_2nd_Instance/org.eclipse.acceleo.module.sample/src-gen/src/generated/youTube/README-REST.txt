REF-generated REST backend scaffold
Model: YouTube 3.2
Profile: media-feedback
Port: 8082

Scope restriction:
This generator must only expose behavior that is explicitly present in the provided domain model and REF scenario text.
No extra platform behavior should be inferred beyond those artifacts.

Scenario summary:
Evaluated resources are videos; users comment videos, react with like/dislike, comments may thread, comments can be reported, and comments are commonly sorted by date or value.

Generated endpoints:
- POST /api/auth/register
- POST /api/auth/login
- GET /api/channels
- GET /api/channels/{channelId}
- POST /api/channels
- PUT /api/channels/{channelId}
- DELETE /api/channels/{channelId}
- GET /api/videos?channelId={channelId}
- GET /api/videos/{videoId}
- POST /api/channels/{channelId}/videos
- PUT /api/videos/{videoId}
- DELETE /api/videos/{videoId}
- GET /api/comments?videoId={videoId}
- GET /api/comments/{commentId}
- POST /api/videos/{videoId}/comments
- PUT /api/comments/{commentId}
- DELETE /api/comments/{commentId}
- GET /api/likes?videoId={videoId}
- GET /api/likes?commentId={commentId}
- POST /api/likes?videoId={videoId}
- POST /api/likes?commentId={commentId}
- DELETE /api/likes/{likeId}
- GET /api/subscriptions?userId={userId}
- POST /api/subscriptions/{channelId}
- DELETE /api/subscriptions/{subscriptionId}
- GET /api/policies/channels/{channelId}/permissions
- POST /api/policies/channels/{channelId}/permissions
- GET /api/policies/channels/{channelId}/sorting
- POST /api/policies/channels/{channelId}/sorting
- GET /api/policies/validation-rules?videoId={videoId}&commentId={commentId}
- POST /api/policies/validation-rules?videoId={videoId}&commentId={commentId}
- GET /api/reports?status={status}
- POST /api/reports?videoId={videoId}
- POST /api/reports?commentId={commentId}
- GET /api/moderation/videos/{videoId}/checks
- POST /api/moderation/videos/{videoId}/checks
- GET /api/moderation/comments/{commentId}/checks
- POST /api/moderation/comments/{commentId}/checks
- POST /api/moderation/videos/{videoId}/comment-status?status={status}
- POST /api/moderation/videos/{videoId}/simulate
- POST /api/moderation/comments/{commentId}/simulate
- POST /api/moderation/reports/simulate
- GET /h2-console
