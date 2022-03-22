package com.risbo_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SpringBootKeycloakAppApplication {
	
	public static void main(String[] args) {
		
	/*
	BCryptPasswordEncoder bcpe = new BCryptPasswordEncoder();
	String pwd1 = bcpe.encode("john123");
	String pwd2 = bcpe.encode("sachin123");
	
	System.err.println("pwd1 = "+pwd1);
	System.err.println("pwd2 = "+pwd2);
	*/

		SpringApplication.run(SpringBootKeycloakAppApplication.class, args);
	}
	 

}
