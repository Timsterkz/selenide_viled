package cloud.autotests.tests.vlife.cms;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.By;

import java.util.Random;

import static com.codeborne.selenide.Selenide.$;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MainTest {




    Random randNum = new Random();

    //Каталог кнопок
    SelenideElement saveBtn = $(By.xpath("//*[contains(text(),'Сохранить')]")); //кнопка сохранить
    SelenideElement search = $(By.xpath("//input[@placeholder='Поиск']")); //поле ввода поиск
    SelenideElement add = $(By.className("css-ys3397")); //кнопка добавить/создать
    SelenideElement chooseAct = $(By.xpath("//*[contains(text(),'Выберите действие')]")); //кнопка выберите действие
    SelenideElement delete = $(By.xpath("//*[contains(text(),'Удалить')]")); //кнопка удалить

    //Методы
    public void firstElem(int num){ //выбрать первый элемент из списка
        $(By.xpath("//div[@class=\"css-1j0ya3d\"]//label[@for]"), num).click();
    }

    public void login(String l, String p){ //логин/пароль
        $(By.id("1")).sendKeys(l);
        $(By.id("2")).sendKeys(p);
        $(By.id("2")).pressEnter();
    }

    public void openSite(){ //открыть сайт
        Selenide.open("https://cms.dev.vlife.kz/auth/signin");
    }

    public void service(){ //выбрать раздел услуги
        $(By.className("css-htdjeo")).click();
        $(By.xpath("//*[contains(text(),'Услуги')]")).click();
    }





}
