package com.mrh.dao;

import com.mrh.pojo.User;
import com.mrh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
    @Test
    public void getUserList() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = mapper.getUserList();

        for (User user : userList) {

            System.out.println(user);

        }

        sqlSession.close();
    }

    @Test
    public void getUserListById() {
        SqlSession SqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = SqlSession.getMapper(UserMapper.class);
        List<User> userLIstById = mapper.getUserListById(5);
        for (User user : userLIstById) {
            System.out.println(user.toString());
        }
        SqlSession.close();
    }

    @Test
    public void getUserListByNameLike() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userListByNameLike = mapper.getUserListByNameLike("第");
        for (User user : userListByNameLike) {
            System.out.println(user);
        }


        sqlSession.close();

    }

    @Test
    public void getUserListById1(){
        SqlSession sqlSession =MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String,Object> map=new HashMap<String, Object>();
        map.put("userid",5);
        map.put("username","第五");

        List<User> userListById1 = mapper.getUserListById1(map);
        for (User user : userListById1) {
            System.out.println(user.toString());
        }


        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.addUser(new User(8, "第六", "666"));
        if (res > 0) {
            System.out.println("插入成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void addUser1(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userid",5);
        map.put("username","第五");
        map.put("password","55555");

        mapper.addUser1(map);


        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int RES = mapper.updateUser(new User(5, "第五啊", "5555"));
        if (RES > 0) {
            System.out.println("更新成功");
        }

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.deleteUser(5);
        if (res>0){
            System.out.println("删除成功");
        }
        sqlSession.commit();
        sqlSession.close();
    }
}

