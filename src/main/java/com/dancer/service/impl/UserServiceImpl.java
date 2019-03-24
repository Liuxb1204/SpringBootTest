package com.dancer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.dancer.entity.User;
import com.dancer.mapper.UserMapper;
import com.dancer.service.UserService;
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
	
	@Autowired UserMapper usermapper;

	/* 
	 * 事务测试
	 */
	@Override
	@Transactional   //事务的注解
	public void tranfor(String username,String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		usermapper.insert(user);
		User user2 = usermapper.selectById(2);
		user2.setUsername("hahahhahah");
		usermapper.updateById(user2);
		
		
		//usermapper.insertUser("aaaa", "123456789");
		//int a = 2/0;
		//usermapper.update("bbbb", 2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
