package com.mrh.dao;

import com.mrh.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    //根据ID查询指定用户
    User queryUserById(@Param("id") int id);

    //修改用户
    int updateUser(User user);

}
