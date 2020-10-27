package cloud.autotests.tests.vlife.cms;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;


class Test4_1CreateService extends TestBase {

    String smth = "Окрашивание волос №" + randNum.nextInt(1000);
    @Order(6)
    @Test
    @Tag("web")
    void  createService() {

        step("Окрыть сайт", () -> {
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
        step("Выбрать услуги", () -> {
            $(By.xpath("//*[@id=\"root\"]/div[1]/aside/div[2]/div//a[3]/span")).click();
        });
        step("Создать услугу", () -> {
            $(By.className("css-ys3397")).click();
        });
        step("Заполнить данные", () -> {
            $(By.xpath("//input[@placeholder='Выберите']")).sendKeys("Волосы");
            $(By.className("css-vgkc7w"), 0).click();
            $(By.xpath("//input[@placeholder='Работа с головой']")).sendKeys(smth);
            $(By.xpath("//input[@placeholder='Введите минимальную цену']")).sendKeys("3500");
            $(By.xpath("//input[@placeholder='Введите максимальную цену']")).sendKeys("13500");
            $(By.xpath("//input[@placeholder='Введите минуты']")).sendKeys("35");
            $(By.xpath("//input[@placeholder='Выбрать']")).sendKeys("Общие");
            $(By.className("css-vgkc7w"), 0).click();
        });
        step("Сохранить", () -> {
            $(By.xpath("//*[contains(text(),'Сохранить')]")).click();
        });
        step("Найти созданного клиента", () -> {
            $(By.xpath("//input[@placeholder='Поиск']")).sendKeys(smth);
        });
        step("Выбрать Клиента из списка", () -> {
            $(By.xpath("//div[@class=\"css-1j0ya3d\"]//label[@for]"), 1).click();
//            $("body").shouldHave(Condition.text(smth));

        });

    }
}
