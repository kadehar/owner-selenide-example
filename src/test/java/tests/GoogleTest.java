package tests;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.time.Duration.ofSeconds;

public class GoogleTest extends TestBase {

    private final SelenideElement search = $(byName("q"));

    @Test
    public void searchDucks() {
        open(config.baseUrl());
        search.click();
        search.setValue("ducks").pressEnter();
        $("#result-stats").shouldBe(visible,
                ofSeconds(10));
    }
}
