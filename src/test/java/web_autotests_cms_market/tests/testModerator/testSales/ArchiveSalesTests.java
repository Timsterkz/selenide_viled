package web_autotests_cms_market.tests.testModerator.testSales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import web_autotests_cms_market.steps.stepsModerator.stepsSales.ArchiveSalesSteps;
import web_autotests_cms_market.tests.testModerator.ModeratorBaseTest;

import static io.qameta.allure.Allure.step;

public class ArchiveSalesTests extends ModeratorBaseTest {
    @Test
    @Order(1)
    @DisplayName("Архив Акции")
    void test() {
        step("открыть вкладку архив акции", ArchiveSalesSteps::openArchiveSales);
    }
}
