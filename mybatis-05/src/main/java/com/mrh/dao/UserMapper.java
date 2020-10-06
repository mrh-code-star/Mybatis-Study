package com.mrh.dao;



import com.mrh.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    List<User> getUsers();

    //方法存在多个参数，所有的参数前面必须加上@Param（“id”）注解
    @Select("select * from user where id=#{id}")
    User getUserById(@Param("id") int id);

    //添加用户
    @Insert("insert into user(id,name,pwd) values (#{id},#{name},#{password})")
    int addUser(User user);

    //修改
    @Update("update user set name=#{name},pwd=#{password} where id=#{id}")
    int updateUser(User user);

    //删除
    @Delete("delete from user where id=#{uid}")
    int deleteUser(@Param("uid") int id);


}
