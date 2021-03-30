package web_autotests_cms_market.steps;

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

}
