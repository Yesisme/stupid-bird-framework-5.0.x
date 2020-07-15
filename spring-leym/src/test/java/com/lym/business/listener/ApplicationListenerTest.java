package com.lym.business.listener;

import com.lym.business.app.AppConfig;
import com.lym.business.bean.LymListener;
import com.lym.business.spring.listener.LymEvent;
import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class ApplicationListenerTest {


	@Test
	public void testApplicationListener(){

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.register(AppConfig.class);

		context.refresh();

		context.publishEvent(new LymEvent(this,new LymListener("1","我是1号事件")){

	});

	}
}
