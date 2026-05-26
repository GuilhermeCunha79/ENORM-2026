REF-generated REST backend scaffold
Model: Reddit 3.2
Profile: community-discussion
Port: 8083

Scope restriction:
This generator must only expose behavior that is explicitly present in the provided domain model and REF scenario text.
No extra platform behavior should be inferred beyond those artifacts.

Scenario summary:
Users post in topic forums, reply in threads, upvote/downvote posts and comments, report posts and comments, and each topic has rules, moderators, and automation support.

Generated endpoints:
- POST /api/auth/register
- POST /api/auth/login
- GET /api/subreddits
- GET /api/subreddits/{subredditId}
- POST /api/subreddits
- PUT /api/subreddits/{subredditId}
- DELETE /api/subreddits/{subredditId}
- GET /api/posts?subredditId={subredditId}
- GET /api/posts/{postId}
- POST /api/subreddits/{subredditId}/posts
- PUT /api/posts/{postId}
- DELETE /api/posts/{postId}
- GET /api/comments?postId={postId}
- GET /api/comments/{commentId}
- POST /api/posts/{postId}/comments
- PUT /api/comments/{commentId}
- DELETE /api/comments/{commentId}
- GET /api/votes?postId={postId}
- GET /api/votes?commentId={commentId}
- POST /api/votes?postId={postId}
- POST /api/votes?commentId={commentId}
- DELETE /api/votes/{voteId}
- GET /api/subscriptions?userId={userId}
- POST /api/subscriptions/{subredditId}
- DELETE /api/subscriptions/{subscriptionId}
- GET /api/policies/subreddits/{subredditId}/permissions
- POST /api/policies/subreddits/{subredditId}/permissions
- GET /api/policies/subreddits/{subredditId}/sorting
- POST /api/policies/subreddits/{subredditId}/sorting
- GET /api/policies/validation-rules?postId={postId}&commentId={commentId}
- POST /api/policies/validation-rules?postId={postId}&commentId={commentId}
- GET /api/reports?status={status}
- POST /api/reports?postId={postId}
- POST /api/reports?commentId={commentId}
- GET /api/moderation/posts/{postId}/checks
- POST /api/moderation/posts/{postId}/checks
- GET /api/moderation/comments/{commentId}/checks
- POST /api/moderation/comments/{commentId}/checks
- POST /api/moderation/posts/{postId}/comment-status?status={status}
- POST /api/moderation/posts/{postId}/simulate
- POST /api/moderation/comments/{commentId}/simulate
- POST /api/moderation/reports/simulate
- GET /h2-console
