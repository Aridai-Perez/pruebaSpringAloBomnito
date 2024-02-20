package com.AloBomnito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.AloBomnito.controller.copy", "com.AloBomnito.AdminRepository.copy"})
@EnableJpaRepositories("com.AloBomnito.AdminRepository.copy")
public class AloBomnitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AloBomnitoApplication.class, args);
	}

}
