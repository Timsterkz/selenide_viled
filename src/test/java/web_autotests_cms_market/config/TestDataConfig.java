package web_autotests_cms_market.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:test.properties",
})
public interface TestDataConfig extends Config {


//    @DefaultValue("amir.zhakipbekov@gmail.com")
//    @DefaultValue("testStock@gmail.com")
    @DefaultValue("moderator@codevie.kz")//test
    String ModeratorEmail();

    @DefaultValue("Donishop727@gmail.com")//test
//    @DefaultValue("moderator@codevie.kz")//dev
    String MerchantEmail();

    @DefaultValue("TeSt0vIyPaS5")
    String password();

    @DefaultValue("+77758229533")
    String UserPhone();

    @DefaultValue("Qwerty123")
    String UserPassword();
}
