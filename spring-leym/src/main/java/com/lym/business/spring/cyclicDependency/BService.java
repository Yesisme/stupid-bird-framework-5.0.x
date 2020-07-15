package com.lym.business.spring.cyclicDependency;

import org.springframework.stereotype.Component;

@Component("bService")
public class BService {

	private AService aService;

	public void setaService(AService aService) {
		this.aService = aService;
	}
}
