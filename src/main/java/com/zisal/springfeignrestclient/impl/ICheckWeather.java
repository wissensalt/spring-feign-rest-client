package com.zisal.springfeignrestclient.impl;

import com.zisal.springfeignrestclient.dto.CheckWeatherResponseDTO;
import feign.Headers;
import feign.Param;
import feign.RequestLine;

/**
 * Created on 2/8/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Headers("Accept: application/json")
public interface ICheckWeather {

    @RequestLine("GET /weather?q={city}&appid={appid}")
    CheckWeatherResponseDTO getWeatherByCity(@Param("city") String p_City, @Param("appid") String p_AppId);
}
