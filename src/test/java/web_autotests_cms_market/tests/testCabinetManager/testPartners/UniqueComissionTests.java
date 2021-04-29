package web_autotests_cms_market.tests.testCabinetManager.testPartners;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import web_autotests_cms_market.steps.stepsCabinetManager.stepsPartners.UniqueComissionSteps;

import static io.qameta.allure.Allure.step;

public class UniqueComissionTests extends CabinetManagerBaseTest{
    @Test
    @Order(1)
    @DisplayName("Уникальные коммиссии")
    void ContentsPublished() {
        step("Перейти в раздел уникальные коммиссии", UniqueComissionSteps::openUniqueCommission);
    }
}
