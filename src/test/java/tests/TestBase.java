package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import core.config.ConfigUtil;
import core.config.WebConfig;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    protected static WebConfig config = ConfigUtil.INSTANCE.webConfig();

    @BeforeAll
    public static void setUp() {
        Configuration.browser = config.browser().toString();
        Configuration.fastSetValue = false;
    }

    @AfterAll
    public static void tearDown() {
        Selenide.closeWebDriver();
    }
}
