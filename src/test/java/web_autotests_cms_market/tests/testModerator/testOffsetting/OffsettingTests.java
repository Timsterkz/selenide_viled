package web_autotests_cms_market.tests.testModerator.testOffsetting;

import org.junit.jupiter.api.*;
import web_autotests_cms_market.steps.stepsModerator.stepsOffsetting.OffSettingSteps;
import web_autotests_cms_market.tests.testModerator.ModeratorBaseTest;

import static io.qameta.allure.Allure.step;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OffsettingTests extends ModeratorBaseTest {
    @Test
    @Order(5)
    @DisplayName("Взаиморасчет")
    void test() {
        step("открыть вкладку", OffSettingSteps::openOffSetting);
    }
}
