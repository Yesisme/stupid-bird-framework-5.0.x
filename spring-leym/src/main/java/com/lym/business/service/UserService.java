package com.lym.business.service;

import com.lym.business.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component("userService")
public class UserService{

	@Autowired
	UserDao userMapper;

	public List<Map<String,Object>> getUserList(){
		return userMapper.query();
	}

}
