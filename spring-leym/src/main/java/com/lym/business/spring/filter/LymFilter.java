package com.lym.business.spring.filter;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class  LymFilter implements TypeFilter {

	/**
	 * @param metadataReader 可以获取到当前类的信息
	 * @param metadataReaderFactory 可以获取到其他类的信息
	 */
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
		//获取到当前类的注解信息
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		//获取当前扫描类的信息
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		//获取当前类的资源
		Resource resource = metadataReader.getResource();

		if(classMetadata.getClassName().contains("com.lym.business")){
			System.out.println("lymFilter执行了...当前类是：\t"+classMetadata.getClassName());
			return true;
		}
		return false;
	}
}
