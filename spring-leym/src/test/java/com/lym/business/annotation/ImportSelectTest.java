package com.lym.business.annotation;

import com.lym.business.app.AppConfig;
import com.lym.business.bean.LeImportSelect;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

public class ImportSelectTest {

	@Test
	public void testImportSelect(){

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.register(AppConfig.class);

		context.refresh();

		LeImportSelect lymImportSelect = context.getBean(LeImportSelect.class);

		Assert.notNull(lymImportSelect);
	}
}
