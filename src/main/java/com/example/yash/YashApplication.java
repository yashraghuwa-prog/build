package com.example.yash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class YashApplication {

	public static void main(String[] args) {
		SpringApplication.run(YashApplication.class, args);
		ApplicationContext context =SpringApplication.run(YashApplication.class);

		Dev obj=context.getBean(Dev.class);

		obj.build();

}

}
