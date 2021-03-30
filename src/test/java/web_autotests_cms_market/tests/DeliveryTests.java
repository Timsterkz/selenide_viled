package web_autotests_cms_market.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import web_autotests_cms_market.steps.DeliverySteps;
import web_autotests_cms_market.steps.TestBase;

import static io.qameta.allure.Allure.step;


public class DeliveryTests extends TestBase {

    @Test
    @Order(1)
    @DisplayName("Самовывоз")
    void pickup() {
        step("Перейти в раздел логистика", DeliverySteps::openDelivery);

        step("Перейти в раздел логистика -> самовывоз", DeliverySteps::openPickup);

//        step("Проверить на наличие точек самовывоза, при отсутствие создать", DeliverySteps::PickupCheckExistenseIfNotCreate);
//
//        step("Проверка детали точек самовывоза, с данными со списка", DeliverySteps::checkDetailsOfPickup);
    }

    @Test
    @Order(2)
    @DisplayName("Своя доставка")
    void merchantDelivery() {
        step("Перейти в раздел логистика", DeliverySteps::openDelivery);

        step("Перейти в раздел логистика -> своя доставка", DeliverySteps::openMerchantDelivery);

        step("LocalMerchantDeliveryNextDay", DeliverySteps::LocalMerchantDeliveryNextDay);

        step("LocalMerchantDeliveryOrderDay", DeliverySteps::LocalMerchantDeliveryOrderDay);
        step("LocalMerchantDeliveryOwnVariant", DeliverySteps::LocalMerchantDeliveryOwnVariant);
    }

    @Test
    @Order(3)
    @DisplayName("Vlife доставка")
    void vlifeDelivery() {
        step("Перейти в раздел логистика", DeliverySteps::openDelivery);

        step("Перейти в раздел логистика -> vlife доставка", DeliverySteps::openVlifeDelivery);
//
//        step("Проверить на наличие vlife доставки, при отсутствие создать", DeliverySteps::VlifeDeliveryCheckExistenseIfNotCreate);
//
//        step("Проверка детали vlife доставки, с данными со списка", DeliverySteps::checkDetailsOfVlifeDelivery);
    }
}
