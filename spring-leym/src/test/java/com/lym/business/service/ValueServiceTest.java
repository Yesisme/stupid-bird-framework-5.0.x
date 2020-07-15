package com.lym.business.service;

import com.lym.business.app.AppConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

public class ValueServiceTest {

	@Test
	public void testValue1(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ValueService valueService = (ValueService) context.getBean(ValueService.class);

		Assert.notNull(valueService);

		valueService.getUrl();


	}
}
