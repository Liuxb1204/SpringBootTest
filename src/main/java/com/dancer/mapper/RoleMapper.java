package com.dancer.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.dancer.entity.Role;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author dancer
 * @since 2019-03-24
 */
@Mapper
public interface RoleMapper extends BaseMapper<Role> {

}