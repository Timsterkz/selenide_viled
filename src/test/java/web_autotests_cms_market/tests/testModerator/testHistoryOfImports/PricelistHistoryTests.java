package web_autotests_cms_market.tests.testModerator.testHistoryOfImports;

import org.junit.jupiter.api.*;
import web_autotests_cms_market.steps.stepsModerator.stepsHistoryOfImports.PricelistSteps;
import web_autotests_cms_market.tests.testModerator.ModeratorBaseTest;

import static io.qameta.allure.Allure.step;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PricelistHistoryTests extends ModeratorBaseTest {
    @Test
    @Order(1)
    @DisplayName("История загрузок")
    void test() {
        step("открыть историю загрузок", PricelistSteps::openPricelistHistory);
    }
}
