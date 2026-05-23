package generated.amazon;

import generated.amazon.governance.AmazonGovernance;

public final class AmazonApplication {
public static final String MODEL_NAME = "Amazon";
public static final String MODEL_VERSION = "3.0";
public static final String RUNTIME_PROFILE = "catalog-commerce";

private AmazonApplication() {
}

public static AmazonGovernance governance() {
return new AmazonGovernance();
}
}
