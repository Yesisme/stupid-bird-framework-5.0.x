package com.lym.business.spring.beanFactoryProcessor;

import com.lym.business.annotation.LymAutowired;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//第二次调用SmartInstantiationAwareBeanPostProcessor,寻找到合适的构造器
//现在让他去找到标注有@LymAutowired注解的构造器,构造方法中的参数要在ioc容器中
//@Component
public class LymDetermineCandidateConstructor implements SmartInstantiationAwareBeanPostProcessor {

	@Override
	public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) {

		System.out.println("开始调用自定义的SmartInstantiationAwareBeanPostProcessor");

			if ("cityService".equals(beanName)) {
				Constructor<?>[] constructors = beanClass.getDeclaredConstructors();

				Arrays.stream(constructors).forEach(System.out::println);

				if (constructors.length > 0) {
					List<Constructor<?>>  candidateConstructors= Arrays.stream(constructors).
							filter(constructor -> constructor.isAnnotationPresent(LymAutowired.class)).collect(Collectors.toList());
					Constructor[] Constructor = candidateConstructors.toArray(new Constructor[candidateConstructors.size()]);
					return Constructor.length != 0 ? Constructor : null;
				}
			}
			return null;
	}
}
