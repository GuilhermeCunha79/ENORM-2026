package generated.reddit;

import generated.reddit.governance.RedditGovernance;

public final class RedditApplication {
public static final String MODEL_NAME = "Reddit";
public static final String MODEL_VERSION = "3.2";
public static final String RUNTIME_PROFILE = "community-platform";

private RedditApplication() {
}

public static RedditGovernance governance() {
return new RedditGovernance();
}
}
