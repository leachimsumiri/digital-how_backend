package com.michaelirimus.digitalhow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class DigitalHowApplication {
	public static void main(String[] args) {
		SpringApplication.run(DigitalHowApplication.class, args);
	}
}
