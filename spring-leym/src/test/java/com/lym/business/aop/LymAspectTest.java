package com.lym.business.aop;

import com.lym.business.app.AppConfig;
import com.lym.business.service.AopService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LymAspectTest{


	@Test
	public void testLymAspect(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();
		AopService aopService = (AopService) context.getBean("aopService");
		Assert.assertEquals("lymAop",aopService.getName("lymAop"));
	}

	@Test
	public void testThrowException(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.refresh();
		AopService aopService = (AopService) context.getBean("aopService");

		try {
			aopService.getException(3);
		} catch (RuntimeException e) {
			return;
		}
		Assert.fail();
	}
}
