package com.AlbertAbuav.Exhibition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExhibitionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExhibitionApplication.class, args);
		System.out.println("--- Exhibition Service is Running ! ---");
	}

}
