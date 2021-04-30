package web_autotests_cms_market.steps.stepsModerator.stepsControlOfCatalog;

import org.openqa.selenium.By;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CategorySteps {
    public static void openCategory() {
        $("[data-testid='moon-sidebar-route-moderate-catalog']").click();

        $("[data-testid='moon-sidebar-route-moderate-catalog-category']").click();
    }
    public static void previewOfCategory() throws AWTException {

        Robot r = new Robot();
        //*[@id="root"]/div[1]/main/section/div/div/div[1]/div/button[1]
//        $x("//div/div/div[1]/div/button[1]").click();
        $x("//span[contains(text(), Предпросмотр)]").click();

        r.keyPress(KeyEvent.VK_ESCAPE);
        r.keyRelease(KeyEvent.VK_ESCAPE);
    }

    public static void editCategory() throws AWTException {
        Robot r = new Robot();
        $x("//div[2]//div[1]/div/details/summary/div/div").click();
        $x("//li[contains(text(), Редактировать)]").click();
        r.keyPress(KeyEvent.VK_ESCAPE);
        r.keyRelease(KeyEvent.VK_ESCAPE);
    }
    public static void refill() {
        //*[@id="root"]/div[1]/main/section/div/div/div[1]/div/button[2]
        $(By.xpath("//input[@placeholder='Введите текст']")).sendKeys("");
        $x("//div/div/div[1]/div/button[2]']").click();
    }
    //*[@id="root"]/div[1]/main/section/div/div/div[2]/div/div/div[1]/div/details/summary/div/div/svg


}
