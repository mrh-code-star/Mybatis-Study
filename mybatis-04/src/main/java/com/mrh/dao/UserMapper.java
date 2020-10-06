package com.mrh.dao;

import com.mrh.pojo.User;

import java.util.HashMap;
import java.util.List;

public interface UserMapper {
    User getUserListById(int id);
    List<User> getUserByLimit(HashMap<String, Integer> map);
    //通过rowbounds分页
    List<User> getUserByRowBounds();
}
