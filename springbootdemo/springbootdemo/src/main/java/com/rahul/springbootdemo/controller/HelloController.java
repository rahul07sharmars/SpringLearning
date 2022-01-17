package com.rahul.springbootdemo.controller;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Component
//@Controller
@RestController

public class HelloController {
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
	//endpoint
	@GetMapping(value = "/")
	public String helloWorld() {
		return "Welcome to Springboot";
	}
}
