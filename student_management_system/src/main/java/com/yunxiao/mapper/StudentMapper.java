package com.yunxiao.mapper;

import com.yunxiao.entity.Student;

//处理学生信息相关的数据库操作
public interface StudentMapper {
    void insertStudent(Student student);
    Student selectStudentById(Long id);
    void updateStudent(Student student);
    void deleteStudent(Long id);




}
