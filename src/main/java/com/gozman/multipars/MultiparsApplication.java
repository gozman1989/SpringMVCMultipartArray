package com.gozman.multipars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.gozman")
public class MultiparsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiparsApplication.class, args);
	}

}
