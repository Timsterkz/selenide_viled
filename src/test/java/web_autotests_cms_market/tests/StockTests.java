package web_autotests_cms_market.tests;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.AllureId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import web_autotests_cms_market.steps.AuthSteps;
import web_autotests_cms_market.steps.StockSteps;
import web_autotests_cms_market.steps.TestBase;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static web_autotests_cms_market.steps.StockSteps.*;


class StockTests extends TestBase{

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

//    @Test
//    @Order(2)
//    @DisplayName("Активация самовывоза")
//    void PickupActivation() {
//
//        step("Перейти в раздел склады", StockSteps::openSectionStock);
//
//        step("Проверить на наличие активного самовывоза, при отсутствие активировать", StockSteps::checkExistenseOfStocksIfNotCreate);
//
//
//    }
}