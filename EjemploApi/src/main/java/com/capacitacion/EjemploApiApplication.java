package com.capacitacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EjemploApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemploApiApplication.class, args);
	}

}
