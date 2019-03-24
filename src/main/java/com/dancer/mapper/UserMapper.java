package com.dancer.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.dancer.entity.User;


/**
 * @author Dancer
 * 
 * 继承了mybatisPlus的basemappser类 就不需要再手写sql了
 *
 */
@Mapper
public interface UserMapper extends BaseMapper<User>{
	
	/*@Select("select * from user where id = #{id}")
	User getUserById(@Param("id") Integer id);
	
	@Insert("insert into user VALUES (NULL,#{username},#{password},NULL,NULL,NULL)")
	void insertUser(@Param("username") String username,@Param("password") String password);
	
	@Update("update user set username = #{username} where id = #{id}")
	int update(@Param("username")String username,@Param("id")Integer id);
	
	@Delete("delete from user where id = #{id}")
	void delete(@Param("id") Integer id);*/

}


















