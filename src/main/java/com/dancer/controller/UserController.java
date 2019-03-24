package com.dancer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dancer.entity.User;
import com.dancer.mapper.UserMapper;
import com.dancer.service.UserService;


/**
 * @author Dancer
 * 说明：
 * 		@Controller：只返回页面，用于显示
 * 		@RestController：返回JSON格式的数据
 *
 */

@RestController
// @EnableAutoConfiguration
public class UserController {
	
	@Autowired
	private UserMapper usermapper;
	@Autowired
	private UserService userservice;
		
	@RequestMapping("/hello")
	public String hello(){
		
		return "hello dancer";
	}
	
	@RequestMapping("/excep")
	public String excep(){

		int a = 2/0;

		return "hello dancer exception";
	}
	
	@GetMapping("/getuser")
	public User getUser(Integer id){
		User userById = usermapper.getUserById(id);
		return userById;
	}
	@PostMapping("/adduser")
	public String add(String username,String password){
		usermapper.insertUser(username, password);
		return "success";
	}
	
	/**
	 * @return
	 */
	@RequestMapping("/trans")
	public String shiwu(){
		userservice.tranfor();
		return"success";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
		SpringApplication.run(TestController.class, args);
	}*/
}



















