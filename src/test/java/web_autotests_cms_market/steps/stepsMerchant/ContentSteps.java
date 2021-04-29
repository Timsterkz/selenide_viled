package web_autotests_cms_market.steps.stepsMerchant;

import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class ContentSteps {
    public static void openContent() {
        $("[data-testid='moon-sidebar-route-shop-catalog']").click();
    }
    public static void openPublished() {
        $("[data-testid='moon-sidebar-route-shop-catalog-published']").click();
    }
    public static void openUnpublished() {
        $("[data-testid='moon-sidebar-route-shop-catalog-unpublished']").click();
    }
    public static void openUnrecognized() {
        $("[data-testid='moon-sidebar-route-shop-catalog-unrecognized']").click();
    }

    public static void PublishedCheckExistenseIfNotSubscribe() {
    }
    public static void UnpublishedCheckExistenseIfNotDeactivate() {
    }
    public static void UnrecognizedCheckExistenseIfNotUploadPricelist() {
    }

    public static void pushButtonNewItems() {
        $(".css-svds73").click();
    }

    public static void pushButtonImportsFromFile() {
        $(".css-zifcym").click();

    }
    public static void pushButtonChooseFile() {
        $x(("//*[contains(text(),'Выбрать файл')]")).click();
    }

    public static void uploadFile() throws InterruptedException {
        File file = new File("/Users/donchik/Desktop/testStockPricelist11.xlsx");
        $x(("//input[@id='file']")).uploadFile(file);
//        $(By.xpath("")).sendKeys("/Users/donchik/Desktop/testStockPricelist11.xlsx");
        sleep(6000);
        $(".css-wmh2r").click();
        sleep(6000);

    }
}
