package com.example.demoTestUnitaire;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class DemoTestUnitaireApplicationTests {

	@Test
	void contextLoads() {
	}

}
