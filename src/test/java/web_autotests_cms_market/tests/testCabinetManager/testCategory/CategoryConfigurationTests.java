package web_autotests_cms_market.tests.testCabinetManager.testCategory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import web_autotests_cms_market.steps.TestBase;
import web_autotests_cms_market.steps.stepsCabinetLogist.DeliveryActualSteps;
import web_autotests_cms_market.steps.stepsCabinetManager.stepsCategory.CategoryConfigurationSteps;
import web_autotests_cms_market.tests.testCabinetManager.testPartners.CabinetManagerBaseTest;

import static io.qameta.allure.Allure.step;

public class CategoryConfigurationTests extends CabinetManagerBaseTest {
    @Test
    @Order(1)
    @DisplayName("Кабинет Менеджера -> категории")
    void ContentsPublished() {
        step("Перейти в раздел категория", CategoryConfigurationSteps::openCategory);


//        step("Проверить на наличие опубликованных товаров, при отсутствие подписать", ContentSteps::PublcishedCheckExistenseIfNotSubscribe);

//        step("Проверка детали своей доставки, с данными со списка", ContentSteps::checkDetailsOfMerchantDelivery);
    }
}
