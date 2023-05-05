package com.{{companyName}};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class {{cookiecutter.MainClass}}Application {

	public static void main(String[] args) {
		SpringApplication.run({{cookiecutter.MainClass}}.class, args);
	}

}
