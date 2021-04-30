package web_autotests_cms_market.steps.stepsModerator.stepsControlOfCatalog;

import static com.codeborne.selenide.Selenide.$;

public class ItemSteps {
    public static void openItems() {
        $("[data-testid='moon-sidebar-route-moderate-catalog']").click();
        $("[data-testid='moon-sidebar-route-moderate-catalog-products']").click();
    }
}
