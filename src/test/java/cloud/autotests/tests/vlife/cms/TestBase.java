package cloud.autotests.tests.vlife.cms;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import java.util.Random;

import static cloud.autotests.helpers.AttachmentsHelper.*;
import static cloud.autotests.helpers.BrowserstackHelper.getBSPublicLink;
import static cloud.autotests.helpers.DriverHelper.*;
import static cloud.autotests.helpers.EnvironmentHelper.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;


@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class TestBase {

    public static String
            DEFAULT_LOGIN = "Alex",
            DEFAULT_PASSWORD = "12345";

    @BeforeAll
    @Step("Tests setup")
    public static void beforeAll() {
        addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        configureSelenide();
    }

    @AfterEach
    @Step("Attachments")
    public void afterEach(){
        String sessionId = getSessionId();

        attachScreenshot("Last screenshot");
        attachPageSource();
//        attachNetwork(); // todo
        if (isWeb) attachAsText("Browser console logs", getConsoleLogs());
        if (isIos || isAndroid) attachAsText("Browserstack build link", getBSPublicLink(sessionId));

        closeWebDriver();

        if (isVideoOn) attachVideo(sessionId); // in browserstack video url generates after driver close
    }

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


    public void service(){ //выбрать раздел услуги
        $(By.className("css-htdjeo")).click();
        $(By.xpath("//*[contains(text(),'Услуги')]")).click();
    }



}
