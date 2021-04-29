package web_autotests_cms_market.tests.testModerator.testSales;

import org.junit.jupiter.api.*;
import web_autotests_cms_market.steps.stepsModerator.stepsSales.IncreasedCashbackSteps;
import web_autotests_cms_market.tests.testModerator.ModeratorBaseTest;

import static io.qameta.allure.Allure.step;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class IncreasedCashbackTests extends ModeratorBaseTest {
    @Test
    @Order(1)
    @DisplayName("Повышенный кэшбек")
    void test() {
        step("Открыть вкладку повышенный кэшбек", IncreasedCashbackSteps::openIncreasedCashback);
    }
}
