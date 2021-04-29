package web_autotests_cms_market.tests.testCabinetLogist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import web_autotests_cms_market.steps.TestBase;
import web_autotests_cms_market.steps.stepsCabinetLogist.DeliveryActualSteps;

import static io.qameta.allure.Allure.step;

public class DeliveryActualTests extends TestBase {
    @Test
    @Order(1)
    @DisplayName("Кабинет логиста")
    void ContentsPublished() {
        step("Перейти в раздел кабинет логиста", DeliveryActualSteps::openCabinetLogist);
        step("Перейти в раздел Доставка (Актуальные)", DeliveryActualSteps::openDeliveryActual);
        step("Проверка данных таблиц", DeliveryActualSteps::checkTable);

//        step("Проверить на наличие опубликованных товаров, при отсутствие подписать", ContentSteps::PublcishedCheckExistenseIfNotSubscribe);

//        step("Проверка детали своей доставки, с данными со списка", ContentSteps::checkDetailsOfMerchantDelivery);
    }
}
