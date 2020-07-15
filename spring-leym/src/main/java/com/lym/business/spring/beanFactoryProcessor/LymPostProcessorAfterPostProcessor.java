package com.lym.business.spring.beanFactoryProcessor;

import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class LymPostProcessorAfterPostProcessor implements InstantiationAwareBeanPostProcessor {

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName){

		if("userService".equals(beanName)){
			return false;
		}
		return true;
	}
}
