package web_autotests_cms_market.steps.stepsMerchant;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.$;

public class MerchConfigureSteps {

    public static void openConfigure() {
        $("[data-testid='moon-sidebar-route-shop-settings']").click();
    }
    public static void openSalesMethods() {
        $("[data-testid='moon-sidebar-route-shop-settings-sales-method']").click();
    }
    public static void openCompamyAbout() {
        $("[data-testid='moon-sidebar-route-shop-settings-about']").click();
    }
    public static void openCompanyUsers() {
        $("[data-testid='moon-sidebar-route-shop-settings-users']").click();
    }

    public static void activateDeactivatePaymentCard() throws InterruptedException {
        $(By.xpath("//*[contains(text(),'Платежная карта')]")).click();
        Thread.sleep(3000);

    }

    public static void activateDeactivateInstallmentPlan() throws InterruptedException {
        $(By.xpath("//*[contains(text(),'Рассрочка')]")).click();
        Thread.sleep(3000);

//        $("[data-type='switcher']").click();
    }

    public static void activateDeactivateCredit() throws InterruptedException {
        $(By.xpath("//*[contains(text(),'Кредит')]")).click();
        Thread.sleep(3000);

//        $("[data-type='switcher']").click();
    }

    public static void activateAllEmployees() throws InterruptedException {

        Thread.sleep(5000);
        $(By.xpath("//label[@for='usersTable']")).click();

        $(By.xpath("//*[contains(text(),'Выберите действие')]")).click();
        $(By.className("css-1m4qvug"), 0).click();

//        $(By.xpath("div[1]/main/section//div[2]/div[1]/div[1]/div/details/ul/li[1]")).click();
//        $(By.xpath("//*[contains(text(),'Активировать')]")).click();

    }

    public static void deactivateAllEmployees() throws InterruptedException {

        Thread.sleep(5000);
        $(By.xpath("//label[@for='usersTable']")).click();

        $(By.xpath("//*[contains(text(),'Выберите действие')]")).click();

        $(By.className("css-1m4qvug"), 1).click();
        System.out.println($(".css-1m4qvug"));
//        $(By.xpath("div[1]/main/section//div[2]/div[1]/div[1]/div/details/ul/li[2]")).click();

//        $(By.xpath("//*[contains(li(),'Деактивировать')]")).click();

    }
}
