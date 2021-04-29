package web_autotests_cms_market.tests.testModerator.testItemModeration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import web_autotests_cms_market.steps.stepsModerator.stepsItemModeration.NewRequestsSteps;
import web_autotests_cms_market.tests.testModerator.ModeratorBaseTest;

import static io.qameta.allure.Allure.step;

public class NewRequestsModerationTests extends ModeratorBaseTest {
    @Test
    @Order(1)
    @DisplayName("Новые запросы на модерацию")
    void test() {
        step("Открыть вкладку новые запросы на модерацию", NewRequestsSteps::openNewRequests);
    }
}
