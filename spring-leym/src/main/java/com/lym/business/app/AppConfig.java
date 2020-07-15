package com.lym.business.app;

import com.lym.business.bean.LeImport;
import com.lym.business.spring.filter.LymImportBeanDefinitionRegistry;
import com.lym.business.spring.filter.LymImportSelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(value ="com")
//Component注解不生效
/*@ComponentScan(value ="com",
		excludeFilters =
				{@ComponentScan.Filter(type= FilterType.ANNOTATION,
						classes= {Component.class})})*/
//自定义规则
//@ComponentScan(value ="com",includeFilters ={@ComponentScan.Filter(type= FilterType.CUSTOM,classes={LymFilter.class})})
//
//导入一个order的bean到spring容器,自定义实现导入规则:
@Import({LeImport.class,LymImportSelector.class, LymImportBeanDefinitionRegistry.class})
public class AppConfig {

}
