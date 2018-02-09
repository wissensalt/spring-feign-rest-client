package com.zisal.springfeignrestclient;

import com.zisal.springfeignrestclient.dto.CheckWeatherResponseDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFeignRestClientApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringFeignRestClientApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		System.out.println("Start Application");
		final String APPID = "d1967a4093e8902d696d8c1f55f35e9b";
		ICheckWeather checkWeatherClient = FeignBuilderFactory.createClient(ICheckWeather.class);
		CheckWeatherResponseDTO responseDTO = checkWeatherClient.getWeatherByCity("London", APPID);
		System.out.println(responseDTO.toString());
	}
}