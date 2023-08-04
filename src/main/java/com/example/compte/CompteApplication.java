package com.example.compte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@EnableTransactionManagement
@SpringBootApplication
@ComponentScan(basePackages = "com.example.compte") // Ajouter le package de la classe WebConfig ici

public class CompteApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompteApplication.class, args);
	}

}
