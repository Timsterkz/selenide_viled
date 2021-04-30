package web_autotests_cms_market.steps.stepsModerator.stepsSales;

import static com.codeborne.selenide.Selenide.$;

public class IncreasedCashbackSteps {
    public static void openIncreasedCashback() {
        $("[data-testid='moon-sidebar-route-moderate-shares']").click();
        $("[data-testid='moon-sidebar-route-moderate-shares-cashback']").click();
    }
}
