package core.config;

import org.aeonbits.owner.ConfigFactory;

public enum ConfigUtil {
    INSTANCE;

    public WebConfig webConfig() {
        return ConfigFactory.newInstance()
                .create(WebConfig.class, System.getProperties());
    }
}
