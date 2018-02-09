package com.zisal.springfeignrestclient;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created on 2/9/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@FeignClient(name = "app-client", configuration = FeignConfiguration.class)
public interface IAppClient {
}
