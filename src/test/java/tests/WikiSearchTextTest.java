package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;

public class WikiSearchTextTest extends BaseTest {
    @Test
    void noResultsTest() {
        wikiMainPage.openPage();
        wikiMainPage.searchInput
                .setValue("guru");
        wikiMainPage.foundResults.first().shouldBe(visible);
    }
}
