package web_autotests_cms_market.tests.testMerchant;

import org.junit.jupiter.api.*;
import web_autotests_cms_market.steps.MerchantTestBase;
import web_autotests_cms_market.steps.stepsMerchant.OrderSteps;
import web_autotests_cms_market.steps.TestBase;

import static io.qameta.allure.Allure.step;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderTests extends MerchantTestBase {

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
