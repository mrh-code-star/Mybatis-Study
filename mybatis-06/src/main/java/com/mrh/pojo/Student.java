package com.mrh.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student {
    private int id;
    private String name;

    private Teacher teacher;
}
