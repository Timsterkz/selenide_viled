package web_autotests_cms_market.tests.testCabinetManager.testPartners;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import web_autotests_cms_market.steps.AuthSteps;
import web_autotests_cms_market.steps.TestBase;
import web_autotests_cms_market.steps.stepsCabinetManager.CabinetManagerBaseStep;

import static io.qameta.allure.Allure.step;


@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class CabinetManagerBaseTest extends TestBase {


    @BeforeAll
    public static void cabinetManagerBase() {
        step("открыть Кабинет Менеджера", CabinetManagerBaseStep::cabinetManager);
    }


//    @AfterEach
//    @Step("Attachments")
//    public void afterEach(){
//        String sessionId = getSessionId();
//        attachScreenshot("Last screenshot");
//        attachPageSource();
////        attachNetwork(); // todo
//        if (isWeb) attachAsText("Browser console logs", getConsoleLogs());
//        closeWebDriver();
//        if (isVideoOn) attachVideo(sessionId); // in browserstack video url generates after driver close
//    }
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
