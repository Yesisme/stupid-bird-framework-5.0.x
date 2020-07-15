package com.lym.business.config;

import com.lym.business.spring.aop.LymAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(exposeProxy = true)
public class LymAopConfig {

	@Bean(name="lymAspect")
	public LymAspect lymAspect(){
		return new LymAspect();
	}

}
