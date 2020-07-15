package com.lym.business.cyclicDependency;

import com.lym.business.app.AppConfig;
import com.lym.business.spring.cyclicDependency.AService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

public class CyclicDependencyTest {

	@Test
	public void testCyclicDependency(){

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		AService aService = context.getBean(AService.class);

		Assert.notNull(aService);
	}
}
