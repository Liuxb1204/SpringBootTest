package com.dancer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dancer.mapper.UserMapper;
import com.dancer.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired UserMapper usermapper;

	/* 
	 * 事务测试
	 */
	@Override
	@Transactional   //事务的注解
	public void tranfor() {
		
		usermapper.insertUser("aaaa", "123456789");
		//int a = 2/0;
		usermapper.update("bbbb", 2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
