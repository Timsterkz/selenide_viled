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


public class Test3_3DeletePosition extends cloud.autotests.tests.vlife.cms.MainTest {

    @Test
    @Tag("web")
    @Order(5)
    @AllureId("28")
    @DisplayName("Удалить должность")
    void deletePosition() {
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
            $(By.xpath("//input[@placeholder='Введите должность']")).sendKeys("Косметолог");
            $(className("css-xw1psi")).sendKeys("Косметологические процедуры");
        });

        step("Сохранить", () -> {
            $(By.xpath("//*[contains(text(),'Сохранить')]")).click();
        });

        step("Выбрать должность из списка", () -> {
            $(By.xpath("//div[@class=\"css-1j0ya3d\"]//label[@for]"), 5).click();
        });
        step("Выбрать действие", () ->{
            $(By.xpath("//*[contains(text(),'Выберите действие')]")).click();
        });
        step("Удалить", () -> {
            $(By.xpath("//*[contains(text(),'Удалить')]")).click();
        });

        closeWebDriver();

    }
}
