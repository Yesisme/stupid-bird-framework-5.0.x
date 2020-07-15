package com.lym.business.spring.factoryBean;

import com.lym.business.bean.User;
import org.springframework.beans.factory.FactoryBean;

public class LymFactoryBean implements FactoryBean<User>  {

	/**
	 * 返回创建好的对象
	 * @return
	 */
	@Override
	public User getObject() throws Exception {
		User user = new User();
		user.setName("我是lym的factoryBean");
		return user;
	}

	/**
	 * 返回需要创建对象的类型
	 * @return
	 */
	@Override
	public Class<?> getObjectType() {
		return User.class;
	}

	/**
	 * bean是否是单例的
	 * @return
	 */
	@Override
	public boolean isSingleton() {
		return false;
	}

}
