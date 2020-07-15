package com.lym.business.factoryBean;

import com.lym.business.bean.User;
import com.lym.business.spring.factoryBean.LymFactoryBean;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//通过FactoryBean创建Bean
public class LymFactoryBeanTest {

	@Test
	public void testLymFactoryBeanSigleton(){

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.register(LymFactoryBean.class);

		context.refresh();

		User user1 = context.getBean(User.class);

		User user2 = context.getBean(User.class);

		Assert.assertEquals(user1,user2);
	}

	//修改isSingleton为false
	@Test
	public void testLymFactoryBeanPrototype(){

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.register(LymFactoryBean.class);

		context.refresh();

		Object userBean = context.getBean("lymFactoryBean");

		Assert.assertEquals(User.class,userBean.getClass());

		Object lymFactoryBean = context.getBean("&lymFactoryBean");

		Assert.assertEquals(LymFactoryBean.class,lymFactoryBean.getClass());
		User user1 = context.getBean(User.class);

		User user2 = context.getBean(User.class);

		Assert.assertNotEquals(user1,user2);
	}

}
