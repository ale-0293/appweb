package com.libcode.appweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.libcode.appweb")
public class AppwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppwebApplication.class, args);
	}
}
