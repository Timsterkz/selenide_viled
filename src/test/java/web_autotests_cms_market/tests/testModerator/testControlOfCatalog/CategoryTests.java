package web_autotests_cms_market.tests.testModerator.testControlOfCatalog;

import org.junit.jupiter.api.*;
import web_autotests_cms_market.steps.stepsModerator.stepsControlOfCatalog.CategorySteps;
import web_autotests_cms_market.tests.testModerator.ModeratorBaseTest;

import static io.qameta.allure.Allure.step;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CategoryTests extends ModeratorBaseTest {
    @Test
    @Order(1)
    @DisplayName("Категория")
    void test() {
        step("тест", CategorySteps::openCategory);
    }
}
