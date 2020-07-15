package com.lym.business.spring.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class LymApplicationListener implements ApplicationListener<LymEvent> {

	@Override
	public void onApplicationEvent(LymEvent event) {
		System.out.println("LymApplicationListener收到事件.....："+event.getData());
	}
}
