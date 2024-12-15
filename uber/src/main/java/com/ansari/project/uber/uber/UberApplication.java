package com.ansari.project.uber.uber;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UberApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UberApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("working fine, can continue");
	}
}
