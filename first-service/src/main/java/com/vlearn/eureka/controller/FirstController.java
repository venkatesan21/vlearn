package com.vlearn.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping("/first")
	public String firstMethod() {
		return "successs";
	}

}
