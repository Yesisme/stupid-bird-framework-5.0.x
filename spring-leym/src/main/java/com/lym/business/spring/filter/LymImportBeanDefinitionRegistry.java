package com.lym.business.spring.filter;

import com.lym.business.bean.LeImportBeanDefinitionRegistry;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

import java.util.Set;

public class LymImportBeanDefinitionRegistry implements ImportBeanDefinitionRegistrar {

	//AnnotationMetadata 当前类(appconfig)的全部注解信息
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

		Set<String> annotationTypes = importingClassMetadata.getAnnotationTypes();
		//按类名获取到beanDefinition
		BeanDefinition leImportSelectDefinition = registry.getBeanDefinition("com.lym.business.bean.LeImportSelect");

		System.out.println("leImportSelectDefinition"+leImportSelectDefinition);
		//注册一个BeanDefinition
		RootBeanDefinition beanDefinition = new RootBeanDefinition(LeImportBeanDefinitionRegistry.class);

		registry.registerBeanDefinition("leImportBeanDefinitionRegistry",beanDefinition);
	}
}
