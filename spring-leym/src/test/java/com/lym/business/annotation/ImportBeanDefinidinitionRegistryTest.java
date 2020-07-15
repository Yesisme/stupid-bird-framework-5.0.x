package com.lym.business.annotation;

import com.lym.business.app.AppConfig;
import com.lym.business.bean.LeImportBeanDefinitionRegistry;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

public class ImportBeanDefinidinitionRegistryTest {

	@Test
	public void testImportBeanDefinitionRegistry(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.register(AppConfig.class);

		context.refresh();

		LeImportBeanDefinitionRegistry leRegistry = (LeImportBeanDefinitionRegistry) context.getBean("leImportBeanDefinitionRegistry");
		System.out.println(leRegistry);
		Assert.notNull(leRegistry);
	}
}
