package com.rahul.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//this to configure the springboot project
//which was gone manually in spring
//Annotation
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
		System.out.println("SpringBoot running");
	}
//
}
