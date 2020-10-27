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

class Test3_1CreatePosition extends TestBase {

    @Test
    @Tag("web")
    @Order(3)
    @AllureId("20")
    @DisplayName("Создать должность")
    void createdPosition() {
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
            $(By.xpath("//input[@placeholder='Введите должность']")).sendKeys("Шугаринг");
            $(className("css-xw1psi")).sendKeys("ыорпв орвыв оалвп дыовд");
        });
        step("Сохранить", () -> {
            $(By.xpath("//*[contains(text(),'Сохранить')]")).click();
        });
//        $("body").shouldHave(Condition.text("Парикмахер"));
        closeWebDriver();
    }
}
