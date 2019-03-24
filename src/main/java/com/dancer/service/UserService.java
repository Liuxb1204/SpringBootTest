package com.dancer.service;

import com.baomidou.mybatisplus.service.IService;
import com.dancer.entity.User;

public interface UserService extends IService<User> {
	//执行我的事务
	public void tranfor(String username,String password);
}
