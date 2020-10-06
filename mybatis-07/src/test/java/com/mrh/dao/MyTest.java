package com.mrh.dao;

import com.mrh.pojo.Teacher;
import com.mrh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void getTeacher() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        List<Teacher> teacher = mapper.getTeacher();

        for (Teacher teacher1 : teacher) {

            System.out.println(teacher1);
        }
        sqlSession.close();
    }

    @Test
    public void getTeacher1() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher1 = mapper.getTeacher1(1);
        System.out.println(teacher1);


        sqlSession.close();
    }

    @Test
    public void getTeacher2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher2 = mapper.getTeacher2(1);

        System.out.println(teacher2);


        sqlSession.close();
    }
}
