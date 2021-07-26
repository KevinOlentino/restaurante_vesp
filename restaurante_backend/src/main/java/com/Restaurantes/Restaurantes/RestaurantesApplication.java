package com.Restaurantes.Restaurantes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestaurantesApplication {

	public static void main(String[] args) {
		System.out.println("Olá, Restaurante");
		SpringApplication.run(RestaurantesApplication.class, args);
	}

}
