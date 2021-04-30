package web_autotests_cms_market.steps.stepsCabinetManager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;


@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class CabinetManagerBaseStep {

    public static void cabinetManager() {
        $("[href='/manager']").click(); }

}
