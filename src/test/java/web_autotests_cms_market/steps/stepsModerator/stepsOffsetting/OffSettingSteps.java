package web_autotests_cms_market.steps.stepsModerator.stepsOffsetting;

import static com.codeborne.selenide.Selenide.$;

public class OffSettingSteps {
    public static void openOffSetting() {
        $("[data-testid='moon-sidebar-route-moderate-settlement']").click();
    }
}
