package web_autotests_cms_market.steps;

import static com.codeborne.selenide.Selenide.$;

public class ContentSteps {
    public static void openContent() {
        $("[data-testid='moon-sidebar-route-shop-catalog']").click();
    }
    public static void openPublished() {
        $("[data-testid='moon-sidebar-route-shop-catalog-published']").click();
    }
    public static void openUnpublished() {
        $("[data-testid='moon-sidebar-route-shop-catalog-unpublished']").click();
    }
    public static void openUnrecognized() {
        $("[data-testid='moon-sidebar-route-shop-catalog-unrecognized']").click();
    }

    public static void PublcishedCheckExistenseIfNotSubscribe() {
    }
    public static void UnpublcishedCheckExistenseIfNotDeactivate() {
    }
    public static void UnrecognizedCheckExistenseIfNotUploadPricelist() {
    }




}
