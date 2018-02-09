package com.zisal.springfeignrestclient;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;

/**
 * Created on 2/8/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class FeignBuilderFactory {

    private static final String BASE_URL = "http://samples.openweathermap.org/data/2.5";

    public static <T> T createClient(Class<T> type) {
        return Feign.builder()
                .client(new OkHttpClient())
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .logger(new Slf4jLogger(type))
                .logLevel(feign.Logger.Level.FULL)
                .target(type, BASE_URL);
    }

}
