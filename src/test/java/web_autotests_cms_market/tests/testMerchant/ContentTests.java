package web_autotests_cms_market.tests.testMerchant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import web_autotests_cms_market.steps.MerchantTestBase;
import web_autotests_cms_market.steps.stepsMerchant.ContentSteps;
import web_autotests_cms_market.steps.TestBase;

import static io.qameta.allure.Allure.step;

public class ContentTests extends MerchantTestBase {
    @Test
    @Order(1)
    @DisplayName("Опубликованные")
    void ContentsPublished() {
        step("Перейти в раздел контент", ContentSteps::openContent);

        step("Перейти в раздел контент -> опубликованные", ContentSteps::openPublished);

//        step("Проверить на наличие опубликованных товаров, при отсутствие подписать", ContentSteps::PublcishedCheckExistenseIfNotSubscribe);

//        step("Проверка детали своей доставки, с данными со списка", ContentSteps::checkDetailsOfMerchantDelivery);
    }

    @Test
    @Order(2)
    @DisplayName("Неопубликованные")
    void ContentsUnpublished() {
        step("Перейти в раздел контент", ContentSteps::openContent);

        step("Перейти в раздел контент -> неопубликованные", ContentSteps::openUnpublished);

//        step("Проверить на наличие неопубликованных товаров, при отсутствие деактивировать", ContentSteps::UnpublcishedCheckExistenseIfNotDeactivate);

//        step("Проверка детали своей доставки, с данными со списка", ContentSteps::checkDetailsOfMerchantDelivery);
    }



    @Test
    @Order(3)
    @DisplayName("Загрузка прайслиста")
    void importyPricelist() {
        step("Перейти в раздел контент", ContentSteps::openContent);
        step("Нажать на кнопку +Загрузить товар", ContentSteps::pushButtonNewItems);
        step("Нажать на кнопку импортировать из файла", ContentSteps::pushButtonImportsFromFile);
        step("Нажать на кнопку выбрать файл", ContentSteps::pushButtonChooseFile);
        step("Загрузка файла", ContentSteps::uploadFile);

//        step("Проверить на наличие нераспознанных товаров, при отсутствие загрузить прайслист", ContentSteps::UnrecognizedCheckExistenseIfNotUploadPricelist);

//        step("Проверка детали своей доставки, с данными со списка", ContentSteps::checkDetailsOfMerchantDelivery);
    }
    @Test
    @Order(4)
    @DisplayName("Нераспознанные")
    void ContentsUnrecognized() {
        step("Перейти в раздел контент", ContentSteps::openContent);

        step("Перейти в раздел контент -> нерапознанные", ContentSteps::openUnrecognized);

//        step("Проверить на наличие нераспознанных товаров, при отсутствие загрузить прайслист", ContentSteps::UnrecognizedCheckExistenseIfNotUploadPricelist);

//        step("Проверка детали своей доставки, с данными со списка", ContentSteps::checkDetailsOfMerchantDelivery);
    }
}
