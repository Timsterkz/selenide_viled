package web_autotests_cms_market.steps.stepsCabinetManager.stepsOrder;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AllOrderSteps {
    public static void openAllOrders() {
        $("[data-testid='moon-sidebar-route-manager-orders']").click();
    }

    public static void chooseOrderStatus() {
        $x("//div/div[2]/div/div[1]/div[2]/details/summary/div").click();
    }

    public static void chooseMerchant() {
        $(".controled-select-selection-search-input").clear();
        $(".controled-select-selection-search-input").sendKeys("289");
    }

    public static void choosePhoneNumber() {
        $x("//input[@placeholder='Номер телефона']").clear();
        $x("//input[@placeholder='Номер телефона']").sendKeys("Женщина");
    }
    public static void chooseOrderId() {
        $x("//input[@placeholder='Номер заказа']").clear();
        $x("//input[@placeholder='Номер заказа']").sendKeys("Женщина");

    }

}
