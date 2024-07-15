package config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;

public class WebDriverProvider {
    private final WebDriverConfig config;

    public WebDriverProvider() {
        this.config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    }

    public void setWebConfig() {
        Configuration.browser = config.browser();
        Configuration.browserVersion = config.browserVersion();
        Configuration.baseUrl = config.baseUrl();
        Configuration.pageLoadStrategy = "eager";

        if (config.isRemote()) {
            Configuration.remote = config.remoteUrl();
        }
    }
}
