package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface WebDriverConfig extends Config {
    @Key("browser")
    @DefaultValue("chrome")
    String browser();

    @Key("browserVersion")
    @DefaultValue("120.0")
    String browserVersion();

    @Key("isRemote")
    @DefaultValue("false")
    boolean isRemote();

    @Key("baseUrl")
    @DefaultValue("https://www.wikipedia.org/")
    String baseUrl();

    @Key("remoteUrl")
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub")
    String remoteUrl();
}
