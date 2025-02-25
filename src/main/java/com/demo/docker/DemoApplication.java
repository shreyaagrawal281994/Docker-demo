package com.demo.docker;

import controller.DockerDemoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	private DockerDemoController dockerDemoController;

	@GetMapping("/message")
	public String getMessage() {
		dockerDemoController.method();
		return "Welcome Aboard !";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Hello World");
	}

}
