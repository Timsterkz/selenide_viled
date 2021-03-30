package web_autotests_cms_market.steps;

import com.codeborne.selenide.Condition;
import io.restassured.http.ContentType;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static io.restassured.RestAssured.given;

public class DeliverySteps {

    public static void openDelivery() {
        $("[data-testid='moon-sidebar-route-shop-logistics']").click();
    }

    public static void openPickup() {
        $("[data-testid='moon-sidebar-route-shop-logistics-self-pickup']").click();
    }

    public static void openMerchantDelivery() {
        $("[data-testid='moon-sidebar-route-shop-logistics-self-delivery']").click();


    }
    public static void createLocalMerchantDelivery() {
        $(By.xpath("//*[contains(text(),'Локальная доставка')]")).click();
        $(By.xpath("//*[contains(text(),'+ Добавить доставку')]")).click();
        $(By.xpath("//input[@placeholder='Выберите город']")).sendKeys("Алматы");
        $(By.xpath("//input[@placeholder='Введите стоимость доставки в KZT']")).click();
        $(By.xpath("//input[@placeholder='Введите сумму заказа в KZT']")).click();

//        deliveryPeriodNextDay
//                deliveryPeriodOrderDay
//        $(By.xpath("//input[@placeholder='12:00']")).click();
//        deliveryOwnVariant
//        $(By.xpath("//input[@placeholder='4']")).click();
    }
    public static void LocalMerchantDeliveryNextDay() {
        createLocalMerchantDelivery();
        $(By.xpath("label[@for='deliveryPeriodNextDay']")).click();
        $(By.xpath("//button[@type='submit']")).click();

    }
    public static void LocalMerchantDeliveryOrderDay() {
        createLocalMerchantDelivery();
        $(By.xpath("label[@for='deliveryPeriodOrderDay']")).click();
        $(By.xpath("//input[@placeholder='12:00']")).sendKeys("13:00");
        $(By.xpath("//button[@type='submit']")).click();


    }
    public static void LocalMerchantDeliveryOwnVariant() {
        createLocalMerchantDelivery();
        $(By.xpath("label[@for='deliveryOwnVariant']")).click();
        $(By.xpath("//input[@placeholder='4']")).sendKeys("6");
        $(By.xpath("//button[@type='submit']")).click();

    }


        public static void openVlifeDelivery() {
        $("[data-testid='moon-sidebar-route-shop-logistics-vlife-delivery']").click();
    }

    public static void PickupCheckExistenseIfNotCreate() {
        List<Integer> PickupPoints =
                given()
                        .contentType(ContentType.JSON)
                        .auth().oauth2(AuthSteps.loginToken())
                        .when()
                        .log().uri()
                        .get("https://api-test.vlife.kz/market/core/v1/stocks?page=0&pageSize=25")
                        .then()
                        .statusCode(200)
                        .extract()
                        .response().path("content[0..2].id");
    }

    public static void MerchantDeliveryCheckExistenseIfNotCreate() {
    }

    public static void VlifeDeliveryCheckExistenseIfNotCreate() {
    }

    public static void checkDetailsOfPickup()
    {
    }

    public static void checkDetailsOfMerchantDelivery() {
    }

    public static void checkDetailsOfVlifeDelivery() {
    }



}
