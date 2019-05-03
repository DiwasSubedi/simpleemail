package com.subdave.simpleemail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SimpleemailApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleemailApplication.class, args);
	}

}
