package com.lym.business.service;

import com.lym.business.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class CountryService {

	@Autowired
	private TxService txService;

	public void inCity(String cityName){
		System.out.println(cityName+"\t欢迎您的到来");
	}

}
