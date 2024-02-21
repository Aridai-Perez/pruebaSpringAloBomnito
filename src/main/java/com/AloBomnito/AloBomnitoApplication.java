package com.AloBomnito;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan({"com.AloBomnito.controller.copy", "com.AloBomnito.AdminRepository.copy"})
//@EntityScan("com.AloBomnito.service.copy")
//@EnableAutoConfiguration
//@EnableJpaRepositories("com.AloBomnito.AdminRepository.copy")
public class AloBomnitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AloBomnitoApplication.class, args);
	}

}
