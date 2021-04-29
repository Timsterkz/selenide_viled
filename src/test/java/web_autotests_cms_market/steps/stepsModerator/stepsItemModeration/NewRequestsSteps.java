package web_autotests_cms_market.steps.stepsModerator.stepsItemModeration;

import web_autotests_cms_market.steps.stepsModerator.ModeratorBaseStep;

import static com.codeborne.selenide.Selenide.$;

public class NewRequestsSteps extends ModeratorBaseStep {
    public static void openNewRequests() {
        $("[data-testid='moon-sidebar-route-moderate-products']").click();
        $("[data-testid='moon-sidebar-route-moderate-products-requests']").click();

    }
}
