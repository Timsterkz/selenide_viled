package web_autotests_cms_market.steps.stepsModerator;

import org.junit.jupiter.api.TestInstance;
import web_autotests_cms_market.steps.AuthSteps;

import static com.codeborne.selenide.Selenide.$;


@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class ModeratorBaseStep extends AuthSteps {

    public static void moderator() {
        $("[href='/moderate']").click(); }

}
