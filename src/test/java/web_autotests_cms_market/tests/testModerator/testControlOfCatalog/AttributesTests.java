package web_autotests_cms_market.tests.testModerator.testControlOfCatalog;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import web_autotests_cms_market.steps.stepsModerator.stepsControlOfCatalog.AttributesSteps;
import web_autotests_cms_market.tests.testModerator.ModeratorBaseTest;

import static io.qameta.allure.Allure.step;

public class AttributesTests extends ModeratorBaseTest {
    @Test
    @Order(1)
    @DisplayName("Аттрибуты")
    void test() {
        step("Открыть атрибуты", AttributesSteps::openAttributes);
    }
}
