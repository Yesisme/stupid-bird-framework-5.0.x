package com.lym.business.service;

import com.lym.business.annotation.LymAutowired;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class CityService implements InitializingBean{

	@Autowired
	private UserService userService;

	@Autowired
	private CountryService countryService;

	public CityService(){
		this.countryService = countryService;
		System.out.println("CityService....无参构造方法执行了");
	}

	@LymAutowired
	public CityService(CountryService countryService){
		this.countryService = countryService;
		System.out.println("CityService...countryService的有参构造方法执行了");
	}


	public CityService(CountryService countryService, UserService userService){
		this.countryService = countryService;
		this.userService=userService;
		System.out.println("CityService....countryService,userService有参构造方法执行了");
	}

	//在初始化构造函数并且populate装配属性之后回调
	@PostConstruct
	public void initCityService(){
		System.out.println("CityService中的....PostConstruct注解方法执行了");
	}

	//在属性装配好@PostConstruct之后回调
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("CityService中...实现InitializingBean的afterPropertiesSet方法执行了");
	}

}
