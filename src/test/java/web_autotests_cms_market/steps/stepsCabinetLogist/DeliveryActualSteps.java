package web_autotests_cms_market.steps.stepsCabinetLogist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import web_autotests_cms_market.steps.stepsMerchant.ContentSteps;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class DeliveryActualSteps {


    public static void openCabinetLogist() {
        $("[href='/logist']").click();
    }

    public static void openDeliveryActual() {
        $("[data-testid='moon-sidebar-route-logist-relevant-deliveries']").click();
    }

    public static void checkBoxRedirect() {
        $(By.xpath("//label[@for='selectAllMerchants']")).click();
        $(By.xpath("//label[@for='selectAllMerchants']")).click();
//
//        $("#selectAllMerchants").click();
//        $("#selectAllMerchants").click();

    }
}
