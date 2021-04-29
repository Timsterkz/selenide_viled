package web_autotests_cms_market.tests.testCabinetManager.testOrder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import web_autotests_cms_market.steps.TestBase;
import web_autotests_cms_market.steps.stepsCabinetManager.stepsOrder.AllOrderSteps;
import web_autotests_cms_market.tests.testCabinetManager.testPartners.CabinetManagerBaseTest;

import static io.qameta.allure.Allure.step;

public class AllOrderTests extends CabinetManagerBaseTest {
    @Test
    @Order(1)
    @DisplayName("Заказы")
    void Orders() {
        step("Перейти в раздел все заказы", AllOrderSteps::openAllOrders);
    }

    @Test
    @Order(2)
    @DisplayName("Выбор фильтра по статусам заказа")
    void ChooseStatusOfOrders() {
        step("Отфильтровать по статусам заказа", AllOrderSteps::chooseOrderStatus);
    }

    @Test
    @Order(3)
    @DisplayName("Выбор фильтра по имени мерчантам")
    void chooseAllOrderByMerchant() {
        step("Отфильтровать по имени мерчанта", AllOrderSteps::chooseMerchant);
    }

    @Test
    @Order(4)
    @DisplayName("Выбор фильтра по номеру телефона")
    void chooseAllOrderByPhoneNumberOfClient() {
        step("Отфильтровать по номеру телефона", AllOrderSteps::choosePhoneNumber);
    }

    @Test
    @Order(5)
    @DisplayName("Выбор фильтра по номеру заказа")
    void chooseAllOrderById() {
        step("Отфильтровать по номеру заказа", AllOrderSteps::chooseOrderId);
    }
}
