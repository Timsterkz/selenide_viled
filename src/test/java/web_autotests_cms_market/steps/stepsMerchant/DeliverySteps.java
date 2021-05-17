package web_autotests_cms_market.steps.stepsMerchant;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.openqa.selenium.By;
import web_autotests_cms_market.steps.AuthSteps;

import java.util.List;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;
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
        $x("//*[contains(text(),'Локальная доставка')]").click();
        $x("//*[contains(text(),'+ Добавить доставку')]").click();
        $x("//input[@placeholder='Выберите город']").sendKeys("Алма");
//        $(By.xpath("//*[contains(text(),'Алматы')]")).click();
        $(By.className("css-li3qd")).click();

        $x("//input[@placeholder='Введите стоимость доставки в KZT']").sendKeys("500");
        $x("//input[@placeholder='Введите сумму заказа в KZT']").sendKeys("300");

//        deliveryPeriodNextDay
//                deliveryPeriodOrderDay
//        $(By.xpath("//input[@placeholder='12:00']")).click();
//        deliveryOwnVariant
//        $(By.xpath("//input[@placeholder='4']")).click();
    }
    public static void LocalMerchantDeliveryNextDay() throws InterruptedException {
        createLocalMerchantDelivery();
        sleep(3000);

        $x("//label[@for='deliveryPeriodNextDay']").click();
        sleep(3000);

////        $(By.xpath("//button[@type='submit']")).click();
//        $("button[type='submit']").click();
//        Thread.sleep(3000);


    }
    public static void LocalMerchantDeliveryOrderDay() throws InterruptedException {
        fastSetValue = false;

        createLocalMerchantDelivery();
        sleep(3000);
        $x("//label[@for='deliveryPeriodOrderDay']").click();
        sleep(3000);
        $x("//input[@placeholder='12:00']").click();
        $x("//input[@placeholder='12:00']").sendKeys("13:00");


    }
    public static void PushButtonSubmit() throws InterruptedException {
        $("button[type='submit']").click();}

    public static void LocalMerchantDeliveryOwnVariant() throws InterruptedException {
        fastSetValue = false;

        createLocalMerchantDelivery();
        sleep(3000);
        $x("//label[@for='deliveryOwnVariant']").click();
        Thread.sleep(3000);
        $x("//input[@placeholder='4']").click();
        $x("//input[@placeholder='4']").sendKeys("6");

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
        int row = $$(".rc-table-row").size()+1;

        Response stocksNumber =
//                Arrays.asList(
                given()
                        .auth()
                        .oauth2(AuthSteps.loginToken())
                        .when()
                        .log().uri()
                        .get("https://api-test.vlife.kz/market/core/v1/stocks?page=0&pageSize=25")
                        .then()
//                        .assertThat().body("content[0].pickupAvailable", equalTo(Collections.singletonList(TRUE)))
                        .statusCode(200)
                        .extract()
                        .response();
        List<Integer> e = stocksNumber.getBody().jsonPath().getList("content[0.."+row+"].id");
        System.out.println(e);
        $("[data-row-key=\"" + e.get(0).toString() + "\"]").shouldBe(Condition.exist);
    }



    public static void checkDetailsOfMerchantDelivery() {
    }

    public static void checkDetailsOfVlifeDelivery() {
    }



}
