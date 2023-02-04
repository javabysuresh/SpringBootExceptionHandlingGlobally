package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringBootExceptionHandlingGloballyApplication {
	
	public static void main(String[] args) {
		log.info("loggers added");
		SpringApplication.run(SpringBootExceptionHandlingGloballyApplication.class, args);
	}

}
