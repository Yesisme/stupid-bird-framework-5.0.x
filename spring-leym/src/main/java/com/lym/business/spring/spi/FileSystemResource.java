package com.lym.business.spring.spi;

public class FileSystemResource implements IParse{

	public FileSystemResource(){}

	@Override
	public void parse(String location) {
		System.out.println("解析FileSystem文件");
	}
}
