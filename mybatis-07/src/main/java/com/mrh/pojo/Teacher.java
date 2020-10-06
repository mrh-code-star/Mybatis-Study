package com.mrh.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Teacher  {
    private int id;
    private String name;

    //一个老师有多个学生
    private List<Student> students;

}
