package com.lym.business.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

@Component
public class AwareService implements ApplicationContextAware, BeanNameAware, EmbeddedValueResolverAware {

	@Override
	public void setBeanName(String name) {
		System.out.println("AwareService的BeanNameAware.........\t"+name);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		UserService userService = (UserService) applicationContext.getBean("userService");

		System.out.println("AwareService中实现ApplicationContextAware执行了.........\t"+userService);
	}

	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		System.out.println("AwareService中setEmbeddedValueResolver.....\t"+resolver.resolveStringValue("${os.name}\t")+resolver.resolveStringValue("#{519+1}"));
	}
}
