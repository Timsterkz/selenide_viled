package web_autotests_cms_market.tests.testModerator.testBonuses;

import org.junit.jupiter.api.*;
import web_autotests_cms_market.steps.stepsCabinetManager.stepsPartners.MarketComissionSteps;
import web_autotests_cms_market.steps.stepsModerator.stepsBonuses.BonusesSteps;
import web_autotests_cms_market.tests.testModerator.ModeratorBaseTest;

import static io.qameta.allure.Allure.step;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BonusesTests extends ModeratorBaseTest {
    @Test
    @Order(1)
    @DisplayName("Бонусы")
    void test() {
        step("Открыть бонусы", BonusesSteps::openBonuses);
    }
}
