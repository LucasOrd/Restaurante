package com.coderhouse.h2;

import com.coderhouse.h2.model.Restaurante;
import com.coderhouse.h2.repository.RestauranteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class H2Application {

	public static void main(String[] args) {
		SpringApplication.run(H2Application.class, args);
	}

	@Bean
	public CommandLineRunner loadData(RestauranteRepository repository) {
		return (args) -> {
			repository.save(Restaurante.builder().name("Jose").build());
		};
	}

	}