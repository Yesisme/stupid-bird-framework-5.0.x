package com.lym.business.spi;

import com.lym.business.spring.spi.IParse;
import org.junit.Test;

import java.util.Iterator;
import java.util.ServiceLoader;

public class IParseTest {

	@Test
	public void testIPaese(){
		ServiceLoader<IParse> load = ServiceLoader.load(IParse.class);

		Iterator<IParse> iterator = load.iterator();
		while (iterator.hasNext()){
			iterator.next().parse("jdkSpi");
		}
	}
}
