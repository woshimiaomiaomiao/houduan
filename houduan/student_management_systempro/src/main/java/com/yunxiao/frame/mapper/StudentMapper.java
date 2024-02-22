package com.yunxiao.frame.mapper;

import com.yunxiao.frame.entity.Student;
import org.apache.ibatis.annotations.Mapper;

//处理学生信息相关的数据库操作
@Mapper
public interface StudentMapper {
    void insertStudent(Student student);
    Student selectStudentById(Long id);
    void updateStudent(Student student);
    void deleteStudent(Long id);




}
