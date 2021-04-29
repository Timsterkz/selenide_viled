package web_autotests_cms_market.steps.stepsCabinetLogist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import web_autotests_cms_market.steps.stepsMerchant.ContentSteps;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class DeliveryActualSteps {


    public static void openCabinetLogist() {
        $("[href='/logist']").click();
    }

    public static void openDeliveryActual() {
        $("[data-testid='moon-sidebar-route-logist-relevant-deliveries']").click();
    }

    public static void checkTable() {

    }
}
