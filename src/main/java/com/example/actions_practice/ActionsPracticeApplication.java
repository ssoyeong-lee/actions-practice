package com.example.actions_practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ActionsPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActionsPracticeApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World";
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(defaultValue = "stranger") String name) {
		return "Hello " + name + "!";
	}
}
