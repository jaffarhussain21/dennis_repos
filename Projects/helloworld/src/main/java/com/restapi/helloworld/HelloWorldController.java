package com.restapi.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping(path = "/helloworld")
	public String printHelloWorld() {
		return "Hello World";
	}

	@GetMapping(path = "/helloname/{name}")
	public String printHelloName(@PathVariable String name) {
		return "Hello "+ name;
	}
}
