package com.lym.business.service;

import com.lym.business.spring.listener.LymEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/*
注解式声明
* */
@Service
public class LymLinstenerService {

	@EventListener(classes= LymEvent.class)
	public void Listener(LymEvent event){
		System.out.println("LymLinstenerService收到事件.....："+event.getData());
	}
}
