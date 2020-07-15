package com.lym.business.spring.filter;



import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Set;

//自定义导入逻辑
public class LymImportSelector implements ImportSelector {

	//AnnotationMetadata：标注@import类的所有的注解信息。
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {

		return new String[]{"com.lym.business.bean.LeImportSelect"};
	}
}
