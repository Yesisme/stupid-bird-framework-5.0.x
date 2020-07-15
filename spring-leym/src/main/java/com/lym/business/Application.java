package com.lym.business;

import com.lym.business.app.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.register(AppConfig.class);

		context.refresh();
	}
}
