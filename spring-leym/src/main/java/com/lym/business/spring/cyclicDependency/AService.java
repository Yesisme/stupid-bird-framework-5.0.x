package com.lym.business.spring.cyclicDependency;

import org.springframework.stereotype.Component;

@Component("aService")
public class AService {

	private BService bService;

	public void setbService(BService bService) {
		this.bService = bService;
	}
}
