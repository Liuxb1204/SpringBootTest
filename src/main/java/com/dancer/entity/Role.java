package com.dancer.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author dancer
 * @since 2019-03-24
 */
public class Role extends Model<Role> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	private String rolename;
	private Integer uid;


	public Integer getId() {
		return id;
	}

	public Role setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getRolename() {
		return rolename;
	}

	public Role setRolename(String rolename) {
		this.rolename = rolename;
		return this;
	}

	public Integer getUid() {
		return uid;
	}

	public Role setUid(Integer uid) {
		this.uid = uid;
		return this;
	}

	public static final String ID = "id";

	public static final String ROLENAME = "rolename";

	public static final String UID = "uid";

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Role{" +
			", id=" + id +
			", rolename=" + rolename +
			", uid=" + uid +
			"}";
	}
}
