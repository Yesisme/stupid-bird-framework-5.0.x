package com.lym.business.factoryBean;

import com.lym.business.app.AppConfig;
import com.lym.business.bean.LyzBeanDefinitionRegistryPostProcessor;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class lymBeanDefinitionRegistryPostProcessorTest {

	@Test
	public void testLymBeanDefinitionRegistryPostProcessor(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		LyzBeanDefinitionRegistryPostProcessor lyzBeanDefinitionRegistryPostProcessor = (LyzBeanDefinitionRegistryPostProcessor) context.getBeanDefinition("lyzBeanDefinitionRegistryPostProcessor");
		Assert.assertNotNull(lyzBeanDefinitionRegistryPostProcessor);
	}
}
