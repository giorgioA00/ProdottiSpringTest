package it.devlec.ProdottiSpringTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProdottiSpringTestApplication {

	private static final Logger logger = LoggerFactory.getLogger(ProdottiSpringTestApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(ProdottiSpringTestApplication.class, args);
	}


}
