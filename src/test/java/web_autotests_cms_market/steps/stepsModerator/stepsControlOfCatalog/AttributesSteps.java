package web_autotests_cms_market.steps.stepsModerator.stepsControlOfCatalog;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AttributesSteps {
    public static void openAttributesPage() {
        $("[data-testid='moon-sidebar-route-moderate-catalog']").click();
        $("[data-testid='moon-sidebar-route-moderate-catalog-attributes']").click();
    }

    public static void searchAttributes() {
        //*[@id="root"]/div[1]/main/section/div/div/div[1]/div/button[2]
        $(By.xpath("//input[@placeholder='Поиск']")).sendKeys("");
        $x("//div/div/div[1]/div/button[2]']").click();
    }

    public static void addAttributes() {
        //*[@id="root"]/div[1]/main/section/div/div/div[1]/div/button[2]
        $x("//div/div/div[1]/div/button[2]']").click();
    }

    public static void seacrhAttributesAmongExists() {
//*[@id="root"]/div[3]/div/div/div[1]/div[1]/div/div/input
        String word = "апр";
        $x("//div[3]//div[1]/div[1]//input']").sendKeys(word);
        $x("//div[3]//div[1]/div[1]//input']").sendKeys(word);
//        $("[data-testid='moon-sidebar-route-moderate-catalog-attributes']").click();
    }

    public static void chooseCategory() {
        //*[@id="root"]/div[1]/main/section/div/div/div[1]/div/button[2]
        $(By.xpath("//input[@placeholder='Выберите категорию']")).sendKeys("");
    }

}
