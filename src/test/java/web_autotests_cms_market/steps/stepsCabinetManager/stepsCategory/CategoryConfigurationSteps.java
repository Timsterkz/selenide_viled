package web_autotests_cms_market.steps.stepsCabinetManager.stepsCategory;

import static com.codeborne.selenide.Selenide.$;

public class CategoryConfigurationSteps {
    public static void openCategory() {
        $("[data-testid='moon-sidebar-route-manager-categories']").click();
    }

}
