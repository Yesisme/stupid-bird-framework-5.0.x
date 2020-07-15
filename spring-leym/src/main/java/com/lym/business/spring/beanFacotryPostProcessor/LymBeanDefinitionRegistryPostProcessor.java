package com.lym.business.spring.beanFacotryPostProcessor;

import com.lym.business.bean.LyzBeanDefinitionRegistryPostProcessor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

//bean的定义将要被加载，bean的实例还未创建之前，在BeanFactoryPostProcessor之前加载
@Component
public class LymBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(LyzBeanDefinitionRegistryPostProcessor.class).getBeanDefinition();
		registry.registerBeanDefinition("lyzBeanDefinitionRegistryPostProcessor",beanDefinition);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
		System.out.println("lymBeanDefinitionRegistryPostProcessor执行了...."+"bean的数量:"+beanDefinitionNames.length);
	}
}
