package com.lym.business.beanPostProcessor;

import com.lym.business.app.AppConfig;
import com.lym.business.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

public class LymPostProcessorAfterInstantitaionTest {

	@Test
	public void testLymPostProcessAfterInstantiation(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		UserService user = context.getBean(UserService.class);

		Assert.notNull(user);

		//如果PostProcessorAfterInstantiation开启@Component此处为null,
		// 已经干预了UserService的初始化过程
		System.out.println("userList\t{}"+user.getUserList());

	}
}
