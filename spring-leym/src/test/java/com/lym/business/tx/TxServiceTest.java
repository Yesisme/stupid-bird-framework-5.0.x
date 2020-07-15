package com.lym.business.tx;

import com.lym.business.app.AppConfig;
import com.lym.business.service.TxService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TxServiceTest {


	@Test
	public void testRequiredNew(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		TxService txService = (TxService) context.getBean("txService");
		txService.lymTx("REQUIRES_NEW");
	}

	@Test
	public void testRequired(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		TxService txService = (TxService) context.getBean("txService");
		txService.lymTx("REQUIRED");
	}

}
