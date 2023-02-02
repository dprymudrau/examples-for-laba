package com.solvd.course.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.solvd.course.utils.CryptoUtil;
import com.zebrunner.carina.utils.Configuration;
import com.zebrunner.carina.utils.R;

public class GetWeatherByCityMethod extends AbstractApiMethodV2 {

    public GetWeatherByCityMethod(String cityName) {
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        replaceUrlPlaceholder("city_name", cityName);
        replaceUrlPlaceholder("api_key", CryptoUtil.decrypt(R.CONFIG.get("api_key")));
    }
}
