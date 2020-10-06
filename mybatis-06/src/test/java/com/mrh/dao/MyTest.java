package com.mrh.dao;

import com.mrh.pojo.Student;
import com.mrh.pojo.Teacher;
import com.mrh.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {

    @Test
    public void getTeacher(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        List<Teacher> teacher = mapper.getTeacher(1);

        System.out.println(teacher);


        sqlSession.close();
    }
    @Test
    public void getStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> student = mapper.getStudent();

        for (Student student1 : student) {
            System.out.println(student1);
        }

        sqlSession.close();
    }@Test
    public void getStudent2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);

        List<Student> student = mapper.getStudent2();

        for (Student student1 : student) {
            System.out.println(student1);
        }

        sqlSession.close();
    }

}
