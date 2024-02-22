package com.yunxiao.frame.mapper;

import com.yunxiao.frame.entity.Student;
import org.apache.ibatis.annotations.Mapper;

//处理学生信息相关的数据库操作
@Mapper
public interface StudentMapper {

    Student login(Long id,long password);//登录学生账号
    void updateStudent(Student student);//修改学生信息

    Student selectStudentInformation(long studentId);//通过学生id查找学生所有信息





}
