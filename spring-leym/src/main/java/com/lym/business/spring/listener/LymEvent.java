package com.lym.business.spring.listener;

import org.springframework.context.ApplicationEvent;

public class LymEvent<T> extends ApplicationEvent {

	private T data;

	public LymEvent(Object source) {
		super(source);
	}

	public LymEvent(Object source,T data) {
		super(source);
		this.data=data;
	}

	public T getData() {
		return data;
	}
}
