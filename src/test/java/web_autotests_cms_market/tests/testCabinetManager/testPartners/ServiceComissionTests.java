package web_autotests_cms_market.tests.testCabinetManager.testPartners;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import web_autotests_cms_market.steps.stepsCabinetLogist.DeliveryActualSteps;
import web_autotests_cms_market.steps.stepsCabinetManager.stepsPartners.MarketComissionSteps;
import web_autotests_cms_market.steps.stepsCabinetManager.stepsPartners.ServiceComissionSteps;

import static io.qameta.allure.Allure.step;

public class ServiceComissionTests extends CabinetManagerBaseTest{
    @Test
    @Order(6)
    @DisplayName("Коммиссии услуг")
    void ContentsPublished() {
        step("Перейти в раздел коммиссии услуг", ServiceComissionSteps::openServiceCommission);


//        step("Проверить на наличие опубликованных товаров, при отсутствие подписать", ContentSteps::PublcishedCheckExistenseIfNotSubscribe);

//        step("Проверка детали своей доставки, с данными со списка", ContentSteps::checkDetailsOfMerchantDelivery);
    }

}
