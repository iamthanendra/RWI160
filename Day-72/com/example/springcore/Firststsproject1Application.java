package com.example.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Firststsproject1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Firststsproject1Application.class, args);

		BulbService bulbService = context.getBean(BulbService.class);
		
		System.out.println(bulbService.getBulb());
//		
//		System.out.println(context.getBean(BulbService.class));
//		System.out.println(context.getBean(LGBulb.class));
//		
	}
}
