package com.lym.business.spring.beanFactoryProcessor;

import com.lym.business.service.UserService;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
//@Component
public class LymPostProcessBeforeInstantiation implements InstantiationAwareBeanPostProcessor{


	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) {
		System.out.println("LymPostProcessBeforeInstantiation启动了............");
		if(beanClass== UserService.class){
			UserService u = new UserService();
			return u;
		}
		return null;
	}
}
