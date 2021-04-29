package web_autotests_cms_market.steps;

import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static web_autotests_cms_market.helpers.DriverHelper.configureSelenide;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static io.qameta.allure.Allure.step;
import static web_autotests_cms_market.helpers.AttachmentsHelper.*;
import static web_autotests_cms_market.helpers.DriverHelper.*;
import static web_autotests_cms_market.helpers.EnvironmentHelper.*;


@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class TestBase {


    @BeforeAll
    public static void beforeAll() {
        addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        configureSelenide();
        step("Открыть сайт CMS", AuthSteps::openCms);
        step("Авторизация под мерчантом с ролью модератор", AuthSteps::login);
        step("Открыть выбор кабинета", AuthSteps::checkIsMarket);
    }

    @AfterAll
    public static void close() {
        step("Закрыть CMS", AuthSteps::closeCms);}


    @AfterEach
    @Step("Attachments")
    public void afterEach(){
        String sessionId = getSessionId();
        attachScreenshot("Last screenshot");
        attachPageSource();
//        attachNetwork(); // todo
        if (isWeb) attachAsText("Browser console logs", getConsoleLogs());
        closeWebDriver();
        if (isVideoOn) attachVideo(sessionId); // in browserstack video url generates after driver close
    }
//
//    //Каталог кнопок
//    SelenideElement saveBtn = $(By.xpath("//*[contains(text(),'Сохранить')]")); //кнопка сохранить
//    SelenideElement search = $(By.xpath("//input[@placeholder='Поиск']")); //поле ввода поиск
//    SelenideElement add = $(By.className("css-ys3397")); //кнопка добавить/создать
//    SelenideElement chooseAct = $(By.xpath("//*[contains(text(),'Выберите действие')]")); //кнопка выберите действие
//    SelenideElement delete = $(By.xpath("//*[contains(text(),'Удалить')]")); //кнопка удалить
//
//    //Методы
//    public void firstElem(int num){ //выбрать первый элемент из списка
//        $(By.xpath("//div[@class=\"css-1j0ya3d\"]//label[@for]"), num).click();
//    }



//    @BeforeEach
//    public void loginMarketCMS(){
//
//
//    }
}
