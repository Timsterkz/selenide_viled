package web_autotests_cms_market.steps.stepsCabinetManager.stepsPartners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.codeborne.selenide.Selenide.*;

public class PartnersSteps {
    public static void openListOfPartners() {
        $("[data-testid='moon-sidebar-route-manager-partners']").click();
    }

    public static void pushButtonCreatePartner() {
        $(By.xpath("//div[1]/main/section//div[1]/div[2]/button")).click();
    }

    public static void fillFormCreatePartner() {
        $x("//input[@placeholder='Введите название организации']").clear();
        $x("//input[@placeholder='Введите название организации']").sendKeys("Организация");
        $(By.xpath("//div[4]/div/div[2]//div[1]//div/div[2]/div/div[1]")).click();
//        $x("//input[@placeholder='Выберите из списка']").click();
//        $x("//input[@placeholder='Выберите из списка']").sendKeys("123");
        $(By.xpath("//div[4]/div/div[2]//div[2]/div[1]/div[2]/div")).click();
        $(By.xpath("//div[4]/div/div[2]//div[2]/div[1]/div[2]/div/div[2]/div/div[2]")).click();


        $x("//input[@placeholder='Введите наименование']").clear();
        $x("//input[@placeholder='Введите наименование']").sendKeys("Наименование");
        $x("//input[@placeholder='Введите ИИН']").clear();
        $x("//input[@placeholder='Введите ИИН']").sendKeys("980616350701");
        $x("#bank").clear();
        $x("#bank").sendKeys("123");
//        id="bank"
        $x("//input[@placeholder='Введите банковский счет']").clear();
        $x("//input[@placeholder='Введите банковский счет']").sendKeys("123");
        $x("#jurAddress").clear();
        $x("#jurAddress").sendKeys("123");
        $x("#factAddress").clear();
        $x("#factAddress").sendKeys("123");

//        id="jurAddress"
//        id="factAddress"
        $x("//input[@placeholder='Введите телефон']").clear();
        $x("//input[@placeholder='Введите телефон']").sendKeys("123");
        $x("//input[@placeholder='example@vlife.kz']").clear();
        $x("//input[@placeholder='example@vlife.kz']").sendKeys("123");
        $x("//input[@placeholder='Ф.И.О.']").clear();
        $x("//input[@placeholder='Ф.И.О.']").sendKeys("123");
        $x("//input[@placeholder='Введите должность']").clear();
        $x("//input[@placeholder='Введите должность']").sendKeys("123");
        $x("#status").clear();
        $x("#status").sendKeys("123");
        $x("#responsibleManager").clear();
        $x("#responsibleManager").sendKeys("123");

//        id="status"
//        id="responsibleManager"
        $x("//input[@placeholder='Договор №']").clear();
        $x("//input[@placeholder='Договор №']").sendKeys("123");
        $x(".left").clear();
        $x(".left").sendKeys("123");
        $x(".right").clear();
        $x(".right").sendKeys("123");


    }


    public static void updatePartner() {
//        WebDriver driver = new ChromeDriver();

        $x("//tbody/tr[2]/td[9]/div/details").click();
        $x("//li[contains(text(),'Редактировать')]").click();
//        driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);

    }

    public static void updatePartnerCommercialCondition() throws AWTException {
        Robot r = new Robot();
        $x("//tbody/tr[2]/td[9]/div/details").click();
        $x("//li[contains(text(),'Коммерческие условия')]").click();
//        $x("//div[4]/div/div[2]/div/div/div[3]/div[2]/p").click();
        sleep(2000);
        $x("//div[4]/div/div[2]//div[3]/div[2]").click();
        sleep(2000);

//        $x("//div[4]/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[1]").click();
//        $x("//div[4]/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div[1]").click();
//        sleep(2000);
//        $x("//div[4]/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div[1]/div[3]").click();
//        sleep(2000);
//        $x("//div[4]/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[2]/div/div[1]/div[3]/div[3]").click();

        r.keyPress(KeyEvent.VK_ESCAPE);
        r.keyRelease(KeyEvent.VK_ESCAPE);

//        $x("//div[4]/div/div[2]//div[1]/span").pressEscape();
//        $(".css-ils45y").pressEscape();
//        WebDriver driver =  findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);

//        $(".css-8vsw29").click();
//
//        $x("//div[5]/div/div[2]//div[2]/div/div[1]/div/div").click();
//        $x("//div[4]/div/div[2]//div[2]/div/div[1]//div").click();
//        $x("//div[4]/div/div[2]//div[2]/div/div[1]//div[2]/div/div[1]").click();
//        $x("//div[4]/div/div[2]//div[2]/div/div[1]//div[2]/div/div[1]/div[3]").click();
//        $x("//div[4]/div/div[2]//div[2]/div/div[1]//div[2]/div/div[1]/div[3]/div[3]").click();
//        $x("//div[4]/div/div[2]//div[2]/div/div[2]/div[1]/div/div[2]").sendKeys("10.00");
//        $x("//div[4]/div/div[2]//div[2]/div/div[2]/div[2]/div/div[2]").sendKeys("10.00");
//        $x("//div[4]/div/div[2]//div[2]/div/div[2]/div[3]/div/div[2]").sendKeys("10.00");
//        $x("//div[4]/div/div[2]//div[4]/div[1]/button").click();






    }
}
