package web_autotests_cms_market.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import web_autotests_cms_market.steps.OrderSteps;
import web_autotests_cms_market.steps.TestBase;

import static io.qameta.allure.Allure.step;

public class OrderTests extends TestBase {

    @Test
    @Order(1)
    @DisplayName("Новые заказы")
    void NewOrders() {
        step("Перейти в раздел Заказы", OrderSteps::openOrders);
        step("Перейти в раздел Новые Заказы", OrderSteps::openOrders);

    }

    @Test
    @Order(2)
    @DisplayName("На доставке")
    void ApprovedOrders() {
        step("Перейти в раздел Заказы", OrderSteps::openOrders);
        step("Перейти в раздел На Доставке", OrderSteps::openApproved);

    }

    @Test
    @Order(3)
    @DisplayName("Архив")
    void ArchiveOrders() {
        step("Перейти в раздел Заказы", OrderSteps::openOrders);
        step("Перейти в раздел Архив", OrderSteps::openArchive);

    }

    @Test
    @Order(4)
    @DisplayName("Возвраты")
    void ReturnsOrders() {
        step("Перейти в раздел Заказы", OrderSteps::openOrders);
        step("Перейти в раздел Возвраты", OrderSteps::openReturns);

    }
}
