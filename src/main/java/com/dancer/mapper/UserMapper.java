package com.dancer.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.dancer.entity.User;


/**
 * @author Dancer
 *
 */
@Mapper
public interface UserMapper {
	
	@Select("select * from user where id = #{id}")
	User getUserById(@Param("id") Integer id);
	
	@Insert("insert into user VALUES (NULL,#{username},#{password},NULL,NULL,NULL)")
	void insertUser(@Param("username") String username,@Param("password") String password);
	
	@Update("update user set username = #{username} where id = #{id}")
	int update(@Param("username")String username,@Param("id")Integer id);
	
	@Delete("delete from user where id = #{id}")
	void delete(@Param("id") Integer id);

}


















