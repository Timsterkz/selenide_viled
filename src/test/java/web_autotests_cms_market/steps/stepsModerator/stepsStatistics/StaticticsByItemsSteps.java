package web_autotests_cms_market.steps.stepsModerator.stepsStatistics;

import static com.codeborne.selenide.Selenide.$;

public class StaticticsByItemsSteps {
    public static void openStaticticsByItems() {
        $("[data-testid='moon-sidebar-route-moderate-statistics']").click();
        $("[data-testid='moon-sidebar-route-moderate-statistics-products']").click();

    }
}
