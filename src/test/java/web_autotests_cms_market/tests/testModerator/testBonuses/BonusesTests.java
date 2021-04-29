package web_autotests_cms_market.tests.testModerator.testBonuses;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import web_autotests_cms_market.steps.stepsCabinetManager.stepsPartners.MarketComissionSteps;
import web_autotests_cms_market.steps.stepsModerator.stepsBonuses.BonusesSteps;
import web_autotests_cms_market.tests.testModerator.ModeratorBaseTest;

import static io.qameta.allure.Allure.step;

public class BonusesTests extends ModeratorBaseTest {
    @Test
    @Order(1)
    @DisplayName("Бонусы")
    void test() {
        step("Открыть бонусы", BonusesSteps::openBonuses);
    }
}
