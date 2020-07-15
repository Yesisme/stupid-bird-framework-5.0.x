package com.lym.business.service;

import com.lym.business.bean.User;
import com.lym.business.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

@Service
public class TxService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private TxService txService;

	@Transactional
	public void lymTx(String propagation){
		int num = new Random().nextInt(1000)+100;
		User user = userDao.queryById(num);
		for (int i = 0; i <2 ; i++) {
			if(i==1){
				int j = 0/0;
			}
			if(propagation.equals("REQUIRES_NEW")){
				txService.insetRecordForQequiresNew();
			}else if(propagation.equals("REQUIRED")){
				txService.insetRecordForQequired();
			}

		}
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void insetRecordForQequiresNew(){
		userDao.insertUser(1,getRandomName());
	}


	@Transactional
	public void insetRecordForQequired(){
		userDao.insertUser(1,getRandomName());
	}


	public static String getRandomName(){
		String str = "赵谦苏周五财政甲天下王朝富足的来联盟张滑稽儿子瑞尔牌飞行员皆为利来往兮兮悠哉辗转反侧";
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<3;i++){
			int number = new Random().nextInt(41);
			sb.append(str.charAt(number));
		}
		return sb.toString();
	}




}
