package com.lym.business.lifeCycle;

import com.lym.business.app.AppConfig;
import com.lym.business.bean.LymLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

public class LymLifeCycleTest {

	@Test
	public void testLymLifeCycle(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		LymLifeCycle lymLifeCycle = context.getBean(LymLifeCycle.class);

		Assert.notNull(lymLifeCycle);

		context.close();
	}
}
