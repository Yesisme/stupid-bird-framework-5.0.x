package com.lym.business.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueService {

	//获取dataSource的属性
	@Value("#{dataSource.url}")
	private String url;

	public void getUrl(){
		System.out.println(this.url);
	}
}
