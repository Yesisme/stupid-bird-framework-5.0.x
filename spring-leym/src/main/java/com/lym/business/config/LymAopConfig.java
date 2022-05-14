package com.lym.business.config;

import com.lym.business.spring.aop.LymAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//exposeProxy = true 就算实现的接口也不使用jdk动态代理,强制使用cglib动态代理
@EnableAspectJAutoProxy(exposeProxy = true)
public class LymAopConfig {

	@Bean(name="lymAspect")
	public LymAspect lymAspect(){
		return new LymAspect();
	}

}
