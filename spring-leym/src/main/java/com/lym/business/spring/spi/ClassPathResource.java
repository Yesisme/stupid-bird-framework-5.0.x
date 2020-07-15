package com.lym.business.spring.spi;

public class ClassPathResource implements IParse {

	public ClassPathResource(){}

	@Override
	public void parse(String location) {
		System.out.println("解析ClassPath文件");
	}
}
