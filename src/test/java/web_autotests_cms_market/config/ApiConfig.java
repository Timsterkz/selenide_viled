package web_autotests_cms_market.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:api.properties"
})
public interface ApiConfig extends Config {
    @DefaultValue("https://cms.test.vlife.kz")
//    @DefaultValue("https://cms.dev.vlife.kz")
    String baseURL();

//    @DefaultValue("/market/core")
//    String basePath();
}

