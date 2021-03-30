package web_autotests_cms_market.steps;

import com.codeborne.selenide.Condition;
import io.restassured.http.ContentType;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.restassured.RestAssured.given;

public class StockSteps{

    public static void openSectionStock() {
        $("[data-testid='moon-sidebar-route-shop-stocks']").click();
    }
    public static void pushButtonCreateStock() {
        $(By.xpath("//*[@id=\"root\"]/div[1]/main/section/div/div/div[1]/div/button")).click();
    }

    public static void newStockFillFormOfStock() throws InterruptedException {
        $(By.xpath("//input[@placeholder='Дом']")).shouldBe(Condition.disabled);
        $(By.xpath("//input[@placeholder='ТРЦ, ТД, БЦ, ЖК']")).shouldBe(Condition.disabled);
        $(By.xpath("//input[@placeholder='Введите название склада']")).shouldBe(Condition.disabled);
        $(By.xpath("//input[@placeholder='Телефон']")).shouldBe(Condition.disabled);

        $(".controled-select-selection-search-input").click();
        $(".controled-select-selection-search-input").sendKeys("Алматы");
        Thread.sleep(1500);
        $(".controled-select-selection-search-input").pressEnter();
        fillFormOfStock();
        $(By.xpath("//*[contains(text(),'Создать склад')]")).click();

    }

    public static void fillFormOfStock() {
        $(By.xpath("//input[@placeholder='Офис']")).sendKeys("65");
        $(By.xpath("//input[@placeholder='ТРЦ, ТД, БЦ, ЖК']")).sendKeys("ТРЦ");
        $(By.xpath("//input[@placeholder='Введите название склада']")).sendKeys("Склад1");
        $("#stockSuggest").clear();
        $("#stockSuggest").sendKeys("Достык, 180");
        $(By.xpath("//*[contains(text(),'проспект Достык, 180, Алматы, Казахстан')]")).click();
        $(By.xpath("//input[@placeholder='Телефон']")).click();
        $(By.xpath("//input[@placeholder='Телефон']")).sendKeys(" 702 920 37 58");

    }

    public static void deleteStock() {
        given()
                .contentType(ContentType.JSON)
                .auth().oauth2(AuthSteps.loginToken())
                .when()
                .log().uri()
                .delete("https://api-test.vlife.kz/market/core/v1/stocks/" )
                .then()
                .statusCode(200)
                .extract()
                .response();
    }


    public static void updateStock() throws InterruptedException {
        $(By.xpath("//*[@id=\"root\"]/div[1]/main/section/div/div/div[1]/div/button")).click();
        $(".controled-select-selection-search-input").click();
        $(".controled-select-selection-search-input").sendKeys("Алматы");
        Thread.sleep(1500);
        $(".controled-select-selection-search-input").pressEnter();

        $(By.xpath("//input[@placeholder='Офис']")).clear();
        $(By.xpath("//input[@placeholder='ТРЦ, ТД, БЦ, ЖК']")).clear();
        $(By.xpath("//input[@placeholder='Введите название склада']")).clear();
        $(By.xpath("//input[@placeholder='Телефон']")).clear();
        fillFormOfStock();
        $(By.xpath("//*[contains(text(),'Обновить склад')]")).click();

    }

    public static void checkExistenseOfStocksIfNotCreate() throws InterruptedException {
       boolean isExist =  $("[data-row-key]").exists();
        if(isExist==Boolean.FALSE){
            $(By.xpath("//*[@id=\"root\"]/div[1]/main/section/div/div/div[1]/div/button")).click();
            Thread.sleep(1500);
            $(By.xpath("//input[@placeholder='Дом']")).shouldBe(Condition.disabled);
            $(By.xpath("//input[@placeholder='Офис']")).shouldBe(Condition.disabled);
            $(By.xpath("//input[@placeholder='ТРЦ, ТД, БЦ, ЖК']")).shouldBe(Condition.disabled);
            $(By.xpath("//input[@placeholder='Введите название склада']")).shouldBe(Condition.disabled);
            $(By.xpath("//input[@placeholder='Телефон']")).shouldBe(Condition.disabled);
            $(By.className("css-1wl0hvy")).click();
        }
        else{
            checkDetailsOfStock();


//            class="controled-select-selection-search-input"
            //*[@id="root"]/div[1]/main/section/div/div/div[1]/div/button/text()[2]
        }


    }
    public static void checkDetailsOfStock() {
           int row = $$(".rc-table-row").size()-1;
        List<Integer> stocksNumber =
                given()
                        .contentType(ContentType.JSON)
                        .auth().oauth2(AuthSteps.loginToken())
                        .when()
                        .log().uri()
                        .get("https://api-test.vlife.kz/market/core/v1/stocks?page=0&pageSize=25")
                        .then()
                        .statusCode(200)
                        .extract()
                        .response().path("content[0.."+row+"].id");
        System.out.println(stocksNumber);
        stocksNumber.forEach(e -> {
                    $("[data-row-key='" + e.toString() + "']").click();
//            $(By.className("drawer-content-wrapper")).waitUntil(Condition.not(Condition.visible),5000).isEnabled();
            $(By.className("css-1wl0hvy")).click();

//            getWebDriver().get("https://cms.test.vlife.kz/shop/stocks");
        });
//        $().click();






//        $("[data-row-key]").click();
//        List<WebElement> lstRows=getWebDriver().findElements(By.cssSelector("table>tr[rc-table-measure-row]"));
//
//        for(WebElement row:lstRows){
//            if(row.findElement(By.cssSelector("td")).getText().equals("Stock1")){
//                {
//                    String percentage= row.findElement(By.cssSelector("td:last-child")).getText();
//
//                }
//            }
////        $(By.xpath("//input[@placeholder='Дом']")).shouldHave($("[data-row-key]").);
//        $(By.xpath("//input[@placeholder='ТРЦ, ТД, БЦ, ЖК']")).shouldBe(Condition.disabled);
//        $(By.xpath("//input[@placeholder='Введите название склада']")).shouldBe(Condition.disabled);
//        $(By.xpath("//input[@placeholder='Телефон']")).shouldBe(Condition.disabled);

//    }
}
}