package web_autotests_cms_market.steps;

import static com.codeborne.selenide.Selenide.$;

public class OrderSteps{
    public static void openOrders() {
        $("[data-testid='moon-sidebar-route-shop-orders']").click();
    }

    public static void openApproved() {
        $("[data-testid='moon-sidebar-route-shop-approved']").click();
    }

    public static void openArchive() {
        $("[data-testid='moon-sidebar-route-shop-archive']").click();
    }

    public static void openReturns() {
        $("[data-testid='moon-sidebar-route-shop-returns']").click();
    }

}
