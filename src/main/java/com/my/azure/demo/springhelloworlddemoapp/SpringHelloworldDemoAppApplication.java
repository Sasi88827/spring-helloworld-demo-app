package com.my.azure.demo.springhelloworlddemoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringHelloworldDemoAppApplication {

	@RequestMapping(path = "/helloWorld", method = RequestMethod.GET)
	public String helloWorld() {
		return "Jesus Never Fails! HelloWorld";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringHelloworldDemoAppApplication.class, args);
	}

}
