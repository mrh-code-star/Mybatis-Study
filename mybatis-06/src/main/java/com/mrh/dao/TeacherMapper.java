package com.mrh.dao;

import com.mrh.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {

    @Select("select * from teacher where id=#{tid}")
    public List<Teacher> getTeacher(@Param("tid") int id);
}
