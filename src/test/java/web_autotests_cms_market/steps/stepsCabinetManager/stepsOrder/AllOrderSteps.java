package web_autotests_cms_market.steps.stepsCabinetManager.stepsOrder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.*;

public class AllOrderSteps {
    public static void openAllOrders() {
        $("[data-testid='moon-sidebar-route-manager-orders']").click();
    }

    public static void chooseOrderStatus() {
        $x("//div/div[2]/div/div[1]/div[2]/details/summary/div").click();
    }

    public static void chooseMerchant() throws InterruptedException {
        $(".controled-select-selection-search-input").click();
        $(".controled-select-selection-search-input").sendKeys("ATC");
        sleep(4000);
        $("[data-key='ATC KAZ']").click();
    }

    public static void choosePhoneNumber() {
        //*[@id="root"]/div[1]/main/section/div/div/div[2]/div/div[1]/div[4]/div/div
//        $x("//div/div/div[2]/div/div[1]/div[4]/div/div").click();
        $x("//input[@placeholder='Номер телефона']").click();
        $x("//input[@placeholder='Номер телефона']").sendKeys("702 920 37 58");
//        $x("//div[2]/div/div[1]/div[4]/div/div").sendKeys("702 920 37 58");

//        $x("//input[@placeholder='Номер телефона']").sendKeys("702 920 37 58");
    }
    public static void chooseOrderId() {
        $x("//input[@placeholder='Номер заказа']").clear();
        $x("//input[@placeholder='Номер заказа']").sendKeys("10000001111");

    }

}
