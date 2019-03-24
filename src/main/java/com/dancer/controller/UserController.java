package com.dancer.controller;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
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
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userservice;
	@Autowired
	private UserMapper usermapper;
	
	//获取配置文件的数据
	@Value("${testname}")
	private String myname;
	@Value("${testsex}")
	private String mysex;
		
	@RequestMapping("/hello")
	public String hello(){
		
		return "hello "+myname+" sex:"+mysex;
	}
	
	@RequestMapping("/login")
	public String login(){
		
		return"login";
	}
	
	@RequestMapping("/excep")
	public String excep(){

		int a = 2/0;

		return "hello dancer exception";
	}
	
	@GetMapping("/getuser")
	public User getUser(Integer id){
		User userById = userservice.selectById(id);
		return userById;
	}
	@PostMapping("/adduser")
	public String add(String username,String password){
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		userservice.insert(user);
		return "success";
	}
	
	/**
	 * @return
	 * 验证事务
	 */
	@RequestMapping("/trans")
	public String shiwu(){
		userservice.tranfor("ccccc","123456");
		return"success";
	}
	
	/**
	 * 使用 wrapper 查询
	 * @return
	 */
	@RequestMapping("/selectuser")
	public Object selectuser(){
		
		Wrapper<User> wrapper = new EntityWrapper<User>();
		wrapper.eq(User.PASSWORD, "123456");
		List<User> selectList = userservice.selectList(wrapper);		
		
		return selectList;
	}
	
	
	/**
	 * 分页查询
	 * @param pagenum
	 * @param pagesize
	 * @return
	 */
	@RequestMapping("/selectpage")
	public Object selectPage(Integer pagenum,Integer pagesize){
		
		Wrapper<User> wrapper = new EntityWrapper<User>();
		
		//次方法返回的数据 带有文件头
		/*Page<User> page = new Page<User>((pagenum-1)*pagesize,pagesize);		
		Page<User> selectPage = userservice.selectPage(page, wrapper);*/
		
		RowBounds rowBounds =new RowBounds((pagenum-1)*pagesize,pagesize);
		List<User> list = usermapper.selectPage(rowBounds, wrapper);
		
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {
		SpringApplication.run(TestController.class, args);
	}*/
}



















