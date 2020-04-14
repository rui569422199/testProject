package com.test.wrui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.wrui.TestController.TestController;
import com.test.wrui.TestController.TestRestController;
@SpringBootApplication
public class ControllerStartApplication {
	public static void main(String[] args) {
		SpringApplication.run(ControllerStartApplication.class, args);
//		SpringApplication.run(new Class[] {TestRestController.class,TestController.class}, args);
	}
}
