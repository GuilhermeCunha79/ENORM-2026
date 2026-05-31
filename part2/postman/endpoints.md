# Endpoints por aplicacao

## amazon-backend (port 8081)

### Auth (/api/auth)
- POST /api/auth/register
- POST /api/auth/login

### Contexts (/api/contexts)
- GET /api/contexts
- GET /api/contexts/{contextId}
- POST /api/contexts
- PUT /api/contexts/{contextId}
- DELETE /api/contexts/{contextId}

### Products / Ratings / Reviews (/api/products)
- GET /api/products
- POST /api/products
- GET /api/products/{productId}/average-rating
- POST /api/products/{productId}/reviews

### Reviews (/api/reviews)
- POST /api/reviews

### Comments (/api/comments)
- GET /api/comments?productId={productId}
- GET /api/comments/{commentId}
- POST /api/comments?productId={productId}
- PUT /api/comments/{commentId}
- DELETE /api/comments/{commentId}

### Helpful Votes (/api/comments/{commentId}/votes)
- GET /api/comments/{commentId}/votes
- POST /api/comments/{commentId}/votes
- DELETE /api/comments/{commentId}/votes/{voteId}

### Moderation (/api/moderation)
- POST /api/moderation/reviews/{reviewId}/simulate
- POST /api/moderation/reviews/simulate

### Outros
- GET /h2-console

## reddit-backend (port 8083)

### Auth (/api/auth)
- POST /api/auth/register
- POST /api/auth/login

### Subreddits (/api)
- GET /api/subreddits
- GET /api/subreddits/{subredditId}
- POST /api/subreddits
- PUT /api/subreddits/{subredditId}
- DELETE /api/subreddits/{subredditId}

### Posts (/api)
- GET /api/posts?subredditId={subredditId}
- GET /api/posts/{postId}
- POST /api/subreddits/{subredditId}/posts
- PUT /api/posts/{postId}
- DELETE /api/posts/{postId}

### Comments (/api)
- GET /api/comments?postId={postId}
- GET /api/comments/{commentId}
- POST /api/posts/{postId}/comments
- PUT /api/comments/{commentId}
- DELETE /api/comments/{commentId}

### Votes (/api)
- GET /api/votes?postId={postId} ou GET /api/votes?commentId={commentId}
- POST /api/votes?postId={postId} ou POST /api/votes?commentId={commentId}
- DELETE /api/votes/{voteId}

### Subscriptions (/api)
- GET /api/subscriptions?userId={userId}
- POST /api/subscriptions/{subredditId}
- DELETE /api/subscriptions/{subscriptionId}

### Policies (/api)
- GET /api/policies/subreddits/{subredditId}/permissions
- POST /api/policies/subreddits/{subredditId}/permissions
- GET /api/policies/subreddits/{subredditId}/sorting
- POST /api/policies/subreddits/{subredditId}/sorting
- GET /api/policies/validation-rules?postId={postId}&commentId={commentId}
- POST /api/policies/validation-rules?postId={postId}&commentId={commentId}

### Reports (/api)
- GET /api/reports?status={status}
- POST /api/reports?postId={postId} ou POST /api/reports?commentId={commentId}

### Moderation (/api)
- GET /api/moderation/posts/{postId}/checks
- POST /api/moderation/posts/{postId}/checks
- GET /api/moderation/comments/{commentId}/checks
- POST /api/moderation/comments/{commentId}/checks
- POST /api/moderation/posts/{postId}/comment-status?status={status}
- POST /api/moderation/posts/{postId}/simulate
- POST /api/moderation/comments/{commentId}/simulate
- POST /api/moderation/reports/simulate

### Outros
- GET /h2-console

## youtube-backend (port 8082)

### Auth (/api/auth)
- POST /api/auth/register
- POST /api/auth/login

### Channels (/api)
- GET /api/channels
- GET /api/channels/{channelId}
- POST /api/channels
- PUT /api/channels/{channelId}
- DELETE /api/channels/{channelId}

### Videos (/api)
- GET /api/videos?channelId={channelId}
- GET /api/videos/{videoId}
- POST /api/channels/{channelId}/videos
- PUT /api/videos/{videoId}
- DELETE /api/videos/{videoId}

### Comments (/api)
- GET /api/comments?videoId={videoId}
- GET /api/comments/{commentId}
- POST /api/videos/{videoId}/comments
- PUT /api/comments/{commentId}
- DELETE /api/comments/{commentId}

### Likes (/api)
- GET /api/likes?videoId={videoId} ou GET /api/likes?commentId={commentId}
- POST /api/likes?videoId={videoId} ou POST /api/likes?commentId={commentId}
- DELETE /api/likes/{likeId}

### Subscriptions (/api)
- GET /api/subscriptions?userId={userId}
- POST /api/subscriptions/{channelId}
- DELETE /api/subscriptions/{subscriptionId}

### Policies (/api)
- GET /api/policies/channels/{channelId}/permissions
- POST /api/policies/channels/{channelId}/permissions
- GET /api/policies/channels/{channelId}/sorting
- POST /api/policies/channels/{channelId}/sorting
- GET /api/policies/validation-rules?videoId={videoId}&commentId={commentId}
- POST /api/policies/validation-rules?videoId={videoId}&commentId={commentId}

### Reports (/api)
- GET /api/reports?status={status}
- POST /api/reports?videoId={videoId} ou POST /api/reports?commentId={commentId}

### Moderation (/api)
- GET /api/moderation/videos/{videoId}/checks
- POST /api/moderation/videos/{videoId}/checks
- GET /api/moderation/comments/{commentId}/checks
- POST /api/moderation/comments/{commentId}/checks
- POST /api/moderation/videos/{videoId}/comment-status?status={status}
- POST /api/moderation/videos/{videoId}/simulate
- POST /api/moderation/comments/{commentId}/simulate
- POST /api/moderation/reports/simulate

### Outros
- GET /h2-console

