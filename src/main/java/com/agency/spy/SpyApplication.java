package com.agency.spy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpyApplication.class, args);
	}

}
