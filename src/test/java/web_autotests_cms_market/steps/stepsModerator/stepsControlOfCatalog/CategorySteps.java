package web_autotests_cms_market.steps.stepsModerator.stepsControlOfCatalog;

import static com.codeborne.selenide.Selenide.$;

public class CategorySteps {
    public static void openCategory() {
        $("[data-testid='moon-sidebar-route-moderate-catalog']").click();

        $("[data-testid='moon-sidebar-route-moderate-catalog-category']").click();
    }
}
