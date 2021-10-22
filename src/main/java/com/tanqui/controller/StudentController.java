package com.tanqui.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World!";
	}

}
