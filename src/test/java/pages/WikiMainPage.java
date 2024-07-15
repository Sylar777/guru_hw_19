package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class WikiMainPage {
    public final SelenideElement searchInput = $("#searchInput");
    public final ElementsCollection foundResults = $$(".suggestions-dropdown > a");

    public void openPage() {
        open("");
    }
}
