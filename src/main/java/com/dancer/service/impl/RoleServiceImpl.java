package com.dancer.service.impl;

import com.dancer.entity.Role;
import com.dancer.mapper.RoleMapper;
import com.dancer.service.IRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dancer
 * @since 2019-03-24
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {
	
}
