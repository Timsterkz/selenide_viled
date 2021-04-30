package web_autotests_cms_market.tests.testCabinetManager.testPartners;

import org.junit.jupiter.api.*;
import web_autotests_cms_market.steps.stepsCabinetLogist.DeliveryActualSteps;
import web_autotests_cms_market.steps.stepsCabinetManager.stepsPartners.MarketComissionSteps;
import web_autotests_cms_market.steps.stepsCabinetManager.stepsPartners.PartnersSteps;

import static io.qameta.allure.Allure.step;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PartnersTests extends CabinetManagerBaseTest{
    @Test
    @Order(1)
    @DisplayName("Список партнеров")
    void listOfMerchants() {
        step("Список партнеров", PartnersSteps::openListOfPartners);
    }

//    @Test
//    @Order(2)
//    @DisplayName("Создание партнера")
//    void createMerchant() {
//        step("Создание партнера", PartnersSteps::pushButtonCreatePartner);
//        step("Создание партнера", PartnersSteps::fillFormCreatePartner);
//    }

//    @Test
//    @Order(3)
//    @DisplayName("Редактирование партнера")
//    void updateMerchant() {
//        step("Редактирование партнера", PartnersSteps::updatePartner);
//    }

//    @Test
//    @Order(4)
//    @DisplayName("Редактирование коммерческих условии")
//    void updateMerchantCommercialCondition() {
//        step("Редактирование коммерческих условии", PartnersSteps::updatePartnerCommercialCondition);
//    }



}
