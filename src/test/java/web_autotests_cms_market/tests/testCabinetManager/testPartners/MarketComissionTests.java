package web_autotests_cms_market.tests.testCabinetManager.testPartners;

import org.junit.jupiter.api.*;
import web_autotests_cms_market.steps.stepsCabinetManager.stepsPartners.MarketComissionSteps;

import static io.qameta.allure.Allure.step;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MarketComissionTests extends CabinetManagerBaseTest{
    @Test
    @Order(1)
    @DisplayName("Коммиссии маркета")
    void MarketCommission()  {
//        step("Перейти в раздел партнеры", MarketComissionSteps::openPartners);
        step("Перейти в раздел список партнеров(партнеры)", MarketComissionSteps::openMarketCommission);
    }

}
