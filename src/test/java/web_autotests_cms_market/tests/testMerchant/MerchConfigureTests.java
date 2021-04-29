package web_autotests_cms_market.tests.testMerchant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import web_autotests_cms_market.steps.stepsMerchant.MerchConfigureSteps;
import web_autotests_cms_market.steps.TestBase;

import static io.qameta.allure.Allure.step;

public class MerchConfigureTests extends TestBase {
//    @Test
//    @Order(1)
//    @DisplayName("Методы Продаж")
//    void SalesMethods() {
//        step("Перейти в раздел настройки мерчанта", MerchConfigureSteps::openConfigure);
//        step("Перейти в раздел Метод продажи", MerchConfigureSteps::openSalesMethods);
//        step("Активировать/деактивировать платежную карту", MerchConfigureSteps::activateDeactivatePaymentCard);
//        step("Активировать/деактивировать рассрочку", MerchConfigureSteps::activateDeactivateInstallmentPlan);
//        step("Активировать/деактивировать кредит", MerchConfigureSteps::activateDeactivateCredit);
//
//    }

//    @Test
//    @Order(2)
//    @DisplayName("О компании")
//    void CompanyAbout() {
//        step("Перейти в раздел настройки мерчанта", MerchConfigureSteps::openConfigure);
//        step("Перейти в раздел О компании", MerchConfigureSteps::openCompamyAbout);
//
//    }

    @Test
    @Order(3)
    @DisplayName("Пользователи")
    void CompanyUsers() {
        step("Перейти в раздел настройки мерчанта", MerchConfigureSteps::openConfigure);
        step("Перейти в раздел Пользователи", MerchConfigureSteps::openCompanyUsers);
        step("Активировать всех пользователей", MerchConfigureSteps::activateAllEmployees);
//        step("Деактивировать всех пользователей", MerchConfigureSteps::deactivateAllEmployees);

    }
}
