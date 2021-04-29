package web_autotests_cms_market.steps.stepsModerator.stepsStatistics;

import static com.codeborne.selenide.Selenide.$;

public class StaticticsByMerchantsSteps {
    public static void openStaticticsByMerchants() {
        $("[data-testid='moon-sidebar-route-moderate-statistics']").click();
        $("[data-testid='moon-sidebar-route-moderate-statistics-merchants']").click();
    }
}
