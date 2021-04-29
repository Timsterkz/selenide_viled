package web_autotests_cms_market.tests.testMerchant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import web_autotests_cms_market.steps.MerchantTestBase;
import web_autotests_cms_market.steps.stepsMerchant.StockSteps;
import web_autotests_cms_market.steps.TestBase;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


class StockTests extends MerchantTestBase {

    @Test
    @Order(1)
    @DisplayName("Склады")
    void stocks() {

        step("Перейти в раздел склады", StockSteps::openSectionStock);

        step("Нажать на кнопку +Добавить склад", StockSteps::pushButtonCreateStock);

        step("Заполнить поля склада и создать", StockSteps::newStockFillFormOfStock);

        step("Изменить склад и сверить с данными", StockSteps::updateStock);

//        step("При наличие складов изменить и сверить с данными", StockSteps::checkExistenseOfStocksIfNotCreate);

//        step("Удалить склад через запрос", StockSteps::deleteStock);

//        step("Проверка детали склада, с данными со списка", StockSteps::checkDetailsOfStock);

    }


}