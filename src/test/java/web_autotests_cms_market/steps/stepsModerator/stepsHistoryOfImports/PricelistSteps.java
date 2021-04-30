package web_autotests_cms_market.steps.stepsModerator.stepsHistoryOfImports;

import static com.codeborne.selenide.Selenide.$;

public class PricelistSteps {
    public static void openPricelistHistory() {
        $("[data-testid='moon-sidebar-route-moderate-history']").click();
    }
}
