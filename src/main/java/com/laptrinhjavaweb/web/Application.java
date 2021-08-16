//package com.laptrinhjavaweb.web;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
//
//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
//@EntityScan("com.laptrinhjavaweb.entity")
//public class TestApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(TestApplication.class, args);
//	}
//
//}
package com.laptrinhjavaweb.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}