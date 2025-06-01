package com.javaspring.jsp.jsp;

import org.springframework.boot.SpringApplication;

public class TestJspApplication {

	public static void main(String[] args) {
		SpringApplication.from(JspApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
