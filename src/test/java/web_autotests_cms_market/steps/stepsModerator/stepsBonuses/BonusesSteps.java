package web_autotests_cms_market.steps.stepsModerator.stepsBonuses;

import static com.codeborne.selenide.Selenide.$;

public class BonusesSteps {
    public static void openBonuses() {
        $("[data-testid='moon-sidebar-route-moderate-bonus']").click();
    }


}
