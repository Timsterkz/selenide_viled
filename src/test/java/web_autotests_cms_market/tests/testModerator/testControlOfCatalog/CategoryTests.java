package web_autotests_cms_market.tests.testModerator.testControlOfCatalog;

import org.junit.jupiter.api.*;
import web_autotests_cms_market.steps.stepsModerator.stepsControlOfCatalog.CategorySteps;
import web_autotests_cms_market.tests.testModerator.ModeratorBaseTest;

import static io.qameta.allure.Allure.step;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CategoryTests extends ModeratorBaseTest {
    @Test
    @Order(1)
    @DisplayName("Открыть раздел категория")
    void openCat() {
        step("тест", CategorySteps::openCategory);
    }
    @Test
    @Order(2)
    @DisplayName("Предпросмотр категории")
    void previewOfCat() {
        step("тест", CategorySteps::previewOfCategory);
    }
    @Test
    @Order(3)
    @DisplayName("Нажать на кнопку редактировать категорию")
    void updateCat() {
        step("тест", CategorySteps::editCategory);
    }

}
