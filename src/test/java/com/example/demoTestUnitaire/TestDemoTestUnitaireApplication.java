package com.example.demoTestUnitaire;

import org.springframework.boot.SpringApplication;

public class TestDemoTestUnitaireApplication {

	public static void main(String[] args) {
		SpringApplication.from(DemoTestUnitaireApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
