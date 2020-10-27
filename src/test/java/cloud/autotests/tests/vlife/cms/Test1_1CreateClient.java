package cloud.autotests.tests.vlife.cms;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.AllureId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static io.qameta.allure.Allure.step;


public class Test1_1CreateClient extends cloud.autotests.tests.vlife.cms.MainTest {


    String firstName = "Testing" + randNum.nextInt(100);
    String phonenumb = "7701-856-9878";


    @Test
    @Tag("web")
    @Order(1)
    @AllureId("16")
    @DisplayName("Добавить клиента cms.vlife.kz")
    void createdClient() {
        step("Открыть сайт", () -> {
            openSite();
        });

        step("Авторизация", () -> {
            login("foruitest@gmail.com", "TeSt0vIyPaS5");
        });

        step("Перейти в раздел услуги", () -> {
            service();
        });

        step("Выбрать раздел Клиентская база", () -> {
            $(By.xpath("//*[contains(text(),'Клиентская база')]")).click();
        });

        step("Выбрать Добавить клиента", () -> {
            add.click();
        });

        step("Заполнить все поля", () -> {
            $(By.id("lastName")).sendKeys("Test");
            $(By.id("firstName")).sendKeys(firstName);

            Thread.sleep(1500);
            SelenideElement phone = $(By.id("phone"));
            phone.click();
            phone.clear();
            phone.sendKeys(phonenumb);

            $(By.xpath("//input[@placeholder='Введите почту']")).sendKeys("kkjhndk@gmail.com");
            Thread.sleep(1500);
            SelenideElement bday = $(By.name("dateOfBirth"));
            bday.click();
            bday.clear();
            bday.sendKeys("1998-06-30");
            $(By.xpath("//input[@placeholder='Выберите пол']")).sendKeys("Женщина");

            $(By.xpath("//input[@placeholder='Выбрать']")).sendKeys("ноготочки у Турсына");
            $(By.xpath("/html/body/div[4]/div/div[2]/div/div/div[1]/div[5]/div[1]/div/div[1]/div[2]/div/div[3]/div/div[1]")).click();

            $(By.xpath("//input[@placeholder='Категория']")).sendKeys("а");
            $(By.className("css-vgkc7w"), 0).click();
            SelenideElement discount = $(By.xpath("//input[@id='discount']"));
            discount.click();
            discount.clear();
            discount.sendKeys("10");
        });
        step("Сохранить", () -> {
            saveBtn.click();

            //Assert
//            $("body").shouldHave(Condition.text(firstName));
        });

        closeWebDriver();



    }
}