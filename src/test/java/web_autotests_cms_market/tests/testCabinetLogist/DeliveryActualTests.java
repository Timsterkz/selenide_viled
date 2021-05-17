package web_autotests_cms_market.tests.testCabinetLogist;

import org.junit.jupiter.api.*;
import web_autotests_cms_market.steps.TestBase;
import web_autotests_cms_market.steps.stepsCabinetLogist.DeliveryActualSteps;

import static io.qameta.allure.Allure.step;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DeliveryActualTests extends TestBase {
    @Test
    @Order(1)
    @DisplayName("Кабинет логиста")
    void ContentsPublished() {
        step("Перейти в раздел кабинет логиста", DeliveryActualSteps::openCabinetLogist);
        step("Перейти в раздел Доставка (Актуальные)", DeliveryActualSteps::openDeliveryActual);
        step("Проверка работы выбора всех чекбоксов для переадресации", DeliveryActualSteps::checkBoxRedirect);

    }
}
