package generated.youTube;

import generated.youTube.governance.YouTubeGovernance;

public final class YouTubeApplication {
public static final String MODEL_NAME = "YouTube";
public static final String MODEL_VERSION = "3.2";
public static final String RUNTIME_PROFILE = "media-platform";

private YouTubeApplication() {
}

public static YouTubeGovernance governance() {
return new YouTubeGovernance();
}
}
