package com.navisarv.bootswagger2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

	@GetMapping("/greet")
	public String sayHello() {
		return "Hello, Welcome !!";
	}
}
