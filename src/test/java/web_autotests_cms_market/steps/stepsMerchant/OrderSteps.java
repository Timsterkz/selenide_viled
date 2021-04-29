package web_autotests_cms_market.steps.stepsMerchant;

import static com.codeborne.selenide.Selenide.$;

public class OrderSteps{
    public static void openOrders() {
//        $("[href='/shop/orders/orders']").click();

        $("[data-testid='moon-sidebar-route-shop-orders']").click();
    }

    public static void openApproved() {
        $("[href='/shop/orders/approved']").click();

//        $("[data-testid='moon-sidebar-route-shop-approved']").click();
    }

    public static void openArchive() {
        $("[href='/shop/orders/archive']").click();

//        $("[data-testid='moon-sidebar-route-shop-archive']").click();
    }

    public static void openReturns() {
        $("[href='/shop/orders/returns']").click();
//    $("[data-testid='moon-sidebar-route-shop-returns']").click();
    }

}
