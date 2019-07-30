package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		System.out.println("=====DemoApplication exec========");
		ApplicationContext cxt = SpringApplication.run(DemoApplication.class, args);
//		Arrays.stream(cxt.getBeanDefinitionNames()).forEach(a-> System.out.println(a));
	}

	@Bean
	public CommandLineRunner  commandLineRunner(ApplicationArguments arguments){
		arguments.getNonOptionArgs().stream().forEach(a-> System.out.println(a));
		return args -> System.out.println("=====test lamda =====");
	}


}
