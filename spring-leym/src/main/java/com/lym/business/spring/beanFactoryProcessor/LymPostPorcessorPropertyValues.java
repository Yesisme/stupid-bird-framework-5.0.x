package com.lym.business.spring.beanFactoryProcessor;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import java.beans.PropertyDescriptor;

@Component
public class LymPostPorcessorPropertyValues implements InstantiationAwareBeanPostProcessor {

    @Override
	public PropertyValues postProcessPropertyValues(
			PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName){

    	if("user".equals(beanName)){
			if(pvs==null){
				pvs = new MutablePropertyValues();
			}
			if(pvs instanceof MutablePropertyValues){
				MutablePropertyValues propertyValues = (MutablePropertyValues) pvs;
				propertyValues.add("id",1);
				propertyValues.add("name","lyz");
			}
		}
    	return pvs;
	}
}
