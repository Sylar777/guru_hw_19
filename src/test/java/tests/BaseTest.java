package tests;

import config.WebDriverProvider;
import org.junit.jupiter.api.*;
import pages.WikiMainPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {
    public static WikiMainPage wikiMainPage;

    @BeforeAll
    static void beforeAll() {
        wikiMainPage = new WikiMainPage();

        WebDriverProvider provider = new WebDriverProvider();
        provider.setWebConfig();
    }

    @AfterEach
    void tearDown() {
        closeWebDriver();
    }
}
