package com.mrh.dao;

import com.mrh.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();
    List<User> getUserListById(int id);
    List<User> getUserListByNameLike(String name);
    List<User> getUserListById1(Map<String,Object> map);
    int addUser1(Map<String,Object> map);
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(int id);

}
