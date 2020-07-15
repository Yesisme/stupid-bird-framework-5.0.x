package com.lym.business.annotation;

import com.lym.business.app.AppConfig;
import com.lym.business.bean.LeImport;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

import java.util.Arrays;

public class ImportTest {

	@Test
	public void testImport(){

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.register(AppConfig.class);

		context.refresh();

		LeImport leImport = context.getBean(LeImport.class);

		System.out.println(leImport);

		Assert.notNull(leImport);

	}
}
