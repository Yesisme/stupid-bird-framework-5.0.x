package com.lym.business.annotation;

import com.lym.business.app.AppConfig;
import com.lym.business.bean.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredTest {

	AnnotationConfigApplicationContext context = null;

	@Autowired
	private User u1;

	@Autowired
	private User u2;

	@Test
	@Before
	public void testAutowired(){
		context = new AnnotationConfigApplicationContext();

		RootBeanDefinition ubd1 = (RootBeanDefinition) BeanDefinitionBuilder.rootBeanDefinition(User.class).setScope(BeanDefinition.SCOPE_PROTOTYPE).getBeanDefinition();

		RootBeanDefinition ubd2 = (RootBeanDefinition) BeanDefinitionBuilder.rootBeanDefinition(User.class).setScope(BeanDefinition.SCOPE_PROTOTYPE).getBeanDefinition();

		context.registerBeanDefinition("u1",ubd1);

		context.registerBeanDefinition("u2",ubd2);

		context.refresh();

		User u1 = (User) context.getBean("u1");

		System.out.println(u1);
		u1.setName("u1");

		User u2 = (User) context.getBean("u2");

		u2.setName("u2");

		System.out.println(u2);

	}

	@Test
	public void testGetBean(){

		System.out.println(u1);
		Assert.assertEquals("u1",u1.getName());

		Assert.assertEquals("u2",u2.getName());

	}
}
