package com.lym.business.config;

import com.lym.business.bean.LymLifeCycle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfig {

	@Bean(initMethod = "init",destroyMethod = "destruction")
	public LymLifeCycle lymLifyCycle(){
		return new LymLifeCycle();
	}
}
