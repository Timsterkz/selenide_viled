package web_autotests_cms_market.tests.testMerchant;

import org.junit.jupiter.api.*;
import web_autotests_cms_market.steps.stepsMerchant.DeliverySteps;
import web_autotests_cms_market.steps.stepsMerchant.StockSteps;
import web_autotests_cms_market.steps.TestBase;

import static io.qameta.allure.Allure.step;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DeliveryTests extends TestBase {



    @Test
    @Order(1)
    @DisplayName("Самовывоз")
    void pickup() {
        step("Перейти в раздел логистика", DeliverySteps::openDelivery);

        step("Перейти в раздел логистика -> самовывоз", DeliverySteps::openPickup);

//        step("Проверить на наличие точек самовывоза, при отсутствие создать", DeliverySteps::checkDetailsOfPickup);
//
//        step("Проверка детали точек самовывоза, с данными со списка", DeliverySteps::checkDetailsOfPickup);
    }
    @Test
    @Order(2)
    @DisplayName("Активация самовывоза")
    void PickupActivation() {

        step("Перейти в раздел склады", StockSteps::openSectionStock);

        step("Проверить на наличие активного самовывоза, при отсутствие активировать", StockSteps::checkExistenseOfStocksIfNotCreate);


    }
    @Test
    @Order(3)
    @DisplayName("Деактивация самовывоза")
    void PickupDeactivation() {

        step("Перейти в раздел склады", StockSteps::openSectionStock);

        step("Проверить на наличие активного самовывоза, при наличии деактивировать", StockSteps::checkExistenseOfStocksIfNotCreate);


    }

    @Test
    @Order(4)
    @DisplayName("Своя доставка")
    void merchantDelivery() {
        step("Перейти в раздел логистика", DeliverySteps::openDelivery);
        step("Перейти в раздел логистика -> своя доставка", DeliverySteps::openMerchantDelivery);
        step("LocalMerchantDeliveryNextDay", DeliverySteps::LocalMerchantDeliveryNextDay);
        step("PushButtonSubmit", DeliverySteps::PushButtonSubmit);
        step("LocalMerchantDeliveryOrderDay", DeliverySteps::LocalMerchantDeliveryOrderDay);
        step("PushButtonSubmit", DeliverySteps::PushButtonSubmit);
        step("LocalMerchantDeliveryOwnVariant", DeliverySteps::LocalMerchantDeliveryOwnVariant);
        step("PushButtonSubmit", DeliverySteps::PushButtonSubmit);

    }

    @Test
    @Order(5)
    @DisplayName("Vlife доставка")
    void vlifeDelivery() {
        step("Перейти в раздел логистика", DeliverySteps::openDelivery);

        step("Перейти в раздел логистика -> vlife доставка", DeliverySteps::openVlifeDelivery);
//
        step("Проверить на наличие vlife доставки, при отсутствие создать", DeliverySteps::VlifeDeliveryCheckExistenseIfNotCreate);
//
        step("Проверка детали vlife доставки, с данными со списка", DeliverySteps::checkDetailsOfVlifeDelivery);
    }
}
