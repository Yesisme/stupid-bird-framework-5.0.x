package com.lym.business.service;

import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AopService {

	@Autowired
	private CountryService countryService;

	public String getName(String name){

		return name;
	}

	public int getException(int num){
		((AopService)AopContext.currentProxy()).getName("北京");
		return 0/0;
	}
}
