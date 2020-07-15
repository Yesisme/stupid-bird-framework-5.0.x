package com.lym.business.beanPostProcessor;

import com.lym.business.app.AppConfig;
import com.lym.business.service.CountryService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LymDetermineCandidateConstructorTest {

	@Test
	public void testLymDetermineCandidateConstructor(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		CountryService countryService = context.getBean(CountryService.class);

		Assert.assertNotNull(countryService);

		countryService.inCity("上海");
	}

}
