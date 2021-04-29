package web_autotests_cms_market.steps;
import com.codeborne.selenide.Condition;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.http.ContentType;
import org.openqa.selenium.By;
import web_autotests_cms_market.config.ConfigHelper;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.restassured.RestAssured.given;

public class AuthSteps {
    protected static String ModeratorEmail = ConfigHelper.getModeratorEmail();
    protected static String password = ConfigHelper.getPassword();

    public static void openCms() {
        open(ConfigHelper.getBaseURL()+"/auth/signin");

    }

    public static void login(){ //логин/пароль
        $(By.xpath("//input[@placeholder='name@domain.kz']")).waitUntil(Condition.visible, 5000);


//        $(By.xpath("//input[@placeholder='name@domain.kz']")).waitWhile(Condition.visible, 2000);
        $(By.xpath("//input[@placeholder='name@domain.kz']")).clear();
        $(By.xpath("//input[@placeholder='name@domain.kz']")).sendKeys(ModeratorEmail);
        $(By.xpath("//input[@placeholder='················']")).clear();
        $(By.xpath("//input[@placeholder='················']")).sendKeys(password);
//        $(By.xpath("//input[@placeholder='················']")).pressEnter();
        $(By.xpath("//*[contains(text(),'Войти')]")).click();
    }

    public static void checkIsMarket(){ //логин/пароль
        $("[data-testid='moon-sidebar-route']").click();
//        $(By.xpath("//*[contains(text(),'Магазин')]")).exists();
    }


    public static String loginToken() {
        String token = given()
                .contentType(ContentType.JSON)
                .body("{\"email\":\"moderator@codevie.kz\",\"password\":\"TeSt0vIyPaS5\"}")
                .log().uri()
                .when()
                .post("https://api-test.vlife.kz/auth/merchant/login")
                .then()
                .log().body()
                .statusCode(200)
                .extract()
                .response().path("accessToken");
        return token;
    }
    public static void closeCms() {
        $(By.xpath("//*[contains(text(),'Выйти')]")).waitUntil(Condition.visible, 5000);
        $(By.xpath("//*[contains(text(),'Выйти')]")).click();

    }


}
