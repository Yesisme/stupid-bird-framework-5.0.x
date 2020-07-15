package com.lym.business.spring.beanFacotryPostProcessor;

import com.lym.business.bean.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

//BeanFactoryPostProcessor标注初始化后调用，no bean，所以的bean的定义已经加载到BeanFactory中
@Component
public class LymBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("LymBeanFactoryPostProcessor启动了.....");
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition)beanFactory.getBeanDefinition("cityService");
		beanDefinition.setScope("singleton");
		beanDefinition.setAutowireMode(3);
		System.out.println("beanDefinition"+beanDefinition);

	}
}
