package com.bekh.springboot.microservice.example.currencyconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.bekh.springboot.microservice.example.currencyconversion")
public class SpringBootMicroserviceCurrencyconversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroserviceCurrencyconversionApplication.class, args);
	}

}
