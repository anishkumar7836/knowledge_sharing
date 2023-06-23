package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class Demo2Application {
	@GetMapping
	public String test(){
		return "Hello From Demo2 App";
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

}