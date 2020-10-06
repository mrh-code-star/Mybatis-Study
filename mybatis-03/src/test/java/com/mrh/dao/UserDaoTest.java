package com.mrh.dao;

import com.mrh.pojo.User;
import com.mrh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserDaoTest {

    @Test
    public void getUserByid(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User userListById = mapper.getUserListById(3);
        System.out.println(userListById);


        sqlSession.commit();
        sqlSession.close();
    }
}
