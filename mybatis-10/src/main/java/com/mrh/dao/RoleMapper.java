package com.mrh.dao;

import java.sql.Connection;
import java.util.List;
import com.mrh.pojo.Role;

public interface RoleMapper {
	
	public List<Role> getRoleList(Connection connection)throws Exception;

}
