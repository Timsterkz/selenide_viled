package web_autotests_cms_market.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import web_autotests_cms_market.steps.DeliverySteps;
import web_autotests_cms_market.steps.MerchConfigureSteps;
import web_autotests_cms_market.steps.TestBase;

import static io.qameta.allure.Allure.step;

public class MerchConfigureTests extends TestBase {
    @Test
    @Order(1)
    @DisplayName("Методы Продаж")
    void SalesMethods() {
        step("Перейти в раздел настройки мерчанта", MerchConfigureSteps::openConfigure);
        step("Перейти в раздел Метод продажи", MerchConfigureSteps::openSalesMethods);

    }

    @Test
    @Order(2)
    @DisplayName("О компании")
    void CompanyAbout() {
        step("Перейти в раздел настройки мерчанта", MerchConfigureSteps::openConfigure);
        step("Перейти в раздел О компании", MerchConfigureSteps::openCompamyAbout);

    }

    @Test
    @Order(3)
    @DisplayName("Пользователи")
    void CompanyUsers() {
        step("Перейти в раздел настройки мерчанта", MerchConfigureSteps::openConfigure);
        step("Перейти в раздел Пользователи", MerchConfigureSteps::openCompanyUsers);

    }
}
