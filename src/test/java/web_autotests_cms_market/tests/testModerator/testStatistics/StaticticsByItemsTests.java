package web_autotests_cms_market.tests.testModerator.testStatistics;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import web_autotests_cms_market.steps.stepsModerator.stepsStatistics.StaticticsByItemsSteps;
import web_autotests_cms_market.tests.testModerator.ModeratorBaseTest;

import static io.qameta.allure.Allure.step;

public class StaticticsByItemsTests extends ModeratorBaseTest {
    @Test
    @Order(1)
    @DisplayName("Статистика по товарам")
    void test() {
        step("тест", StaticticsByItemsSteps::openStaticticsByItems);
    }
}
