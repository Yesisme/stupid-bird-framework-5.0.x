package com.lym.business.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LymLifeCycle implements InitializingBean, DisposableBean {

	public LymLifeCycle(){
		System.out.println("lym生命周期bean构造方法启动........");
	}

	//afterPropertiesSet方法之后启动
	public void init(){
		System.out.println("lym生命周期bean的init方法启动.............");
	}

	public void destruction(){
		System.out.println("lym生命周期bean的destruction方法启动...............");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("lym生命周期bean的destroy方法启动.............");
	}

	//bean属性赋值完成
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("lym生命周期bean的afterPropertiesSet方法启动.............");
	}

	//bean属性赋值之前完成
	@PostConstruct
	public void postConstruct(){
		System.out.println("lym生命周期bean的postConstruc方法启动");
	}

	@PreDestroy
	public void preDestroy(){
		System.out.println("lym生命周期bean的preDestroy方法启动");
	}
}
