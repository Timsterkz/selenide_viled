package cloud.autotests.tests.vlife.cms;

import io.qameta.allure.AllureId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.className;

class Test3_2EditPosition extends TestBase {

    @Test
    @Tag("web")
    @Order(4)
    @AllureId("27")
    @DisplayName("Редактировать должность ")
    void editPosition() {
        step("Открыть сайт", () -> {
            open("https://cms.dev.vlife.kz/auth/signin");
        });
        step("Авторизация", () -> {
            login("foruitest@gmail.com", "TeSt0vIyPaS5");
        });
        step("Перейти в раздел услуги", () -> {
           service();
        });
        step("Выбрать раздел Настройки", () -> {
            $(By.xpath("//*[contains(text(),'Настройки')]")).click();
        });
        step("Перейти в Должности", () -> {
            $(By.xpath("//*[contains(text(),'Должности')]")).click();
        });
        step("Добавить должность", () -> {
            $(className("css-ys3397")).click();
        });

        step("Заполнить данные", () -> {
            $(By.xpath("//input[@placeholder='Введите должность']")).sendKeys("Парикмахер");
            $(className("css-xw1psi")).sendKeys("Волосы я бы ей не доверял");
        });

        step("Сохранить", () -> {
            $(By.xpath("//*[contains(text(),'Сохранить')]")).click();
        });

        step("Выбрать редактировать", () -> {
            $(By.xpath("//tbody/tr[2]/td[4]/div[1]/details[1]/summary[1]/div[1]/*[1]")).click();
            $(By.xpath("//*[contains(text(),'Редактировать')]")).click();

        });

            step("Заполнить все поля", () -> {
                $(By.xpath("//input[@placeholder='Введите должность']")).clear();
                $(By.xpath("//input[@placeholder='Введите должность']")).sendKeys("Hait stylist");
                $(By.className("css-xw1psi")).clear();
                $(By.className("css-xw1psi")).sendKeys("Прически, укладки и покраска волос");
                $(By.xpath("//*[contains(text(),'Сохранить')]")).click();
            });
//        $("body").shouldHave(Condition.text("Прически, укладки и покраска волос"));

        closeWebDriver();
    }
}
