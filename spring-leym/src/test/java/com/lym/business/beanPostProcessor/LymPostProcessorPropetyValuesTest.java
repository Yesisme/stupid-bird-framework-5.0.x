package com.lym.business.beanPostProcessor;

import com.lym.business.app.AppConfig;
import com.lym.business.bean.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LymPostProcessorPropetyValuesTest {

	@Test
	public void testLymPostProcessorPropertyValue(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.register(AppConfig.class);
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) BeanDefinitionBuilder.genericBeanDefinition("com.lym.business.bean.User").setScope("singleton").addPropertyValue("id", "2").addPropertyValue("name", "lym").getBeanDefinition();

		Assert.assertNotNull(beanDefinition);

		MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();

		Assert.assertNotEquals("2",propertyValues.get("id"));
		Assert.assertNotEquals("lym",propertyValues.get("name"));

		context.registerBeanDefinition("user",beanDefinition);

		context.refresh();

		User user = context.getBean(User.class);

		Assert.assertNotEquals("1",user.getId());
		Assert.assertNotEquals("lyz",user.getName());
	}

}
