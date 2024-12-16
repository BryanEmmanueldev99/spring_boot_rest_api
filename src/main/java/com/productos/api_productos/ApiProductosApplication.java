package com.productos.api_productos;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiProductosApplication.class, args);

		String saludo = "Hola Java!";
		Date fecha = new Date();
		System.out.println(saludo);

		System.out.println(fecha);
	}

}
