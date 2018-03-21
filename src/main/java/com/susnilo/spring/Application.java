package com.susnilo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
public class Application {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
