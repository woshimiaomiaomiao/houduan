package com.yunxiao.frame.mapper;

import com.yunxiao.frame.entity.Admin;
import com.yunxiao.frame.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//负责管理员信息相关的数据库操作。
@Mapper
public interface AdminMapper {
    void insertAdmin(Admin admin);  //增加一个新的管理员

    Admin selectAdmin(Long id); //登陆管理员账号

    void updateStudentPartialInfo(int id);//通过学生id修改学生全部信息

    Student selectStudentInformation(long id);//通过学生id查找学生所有信息

    Student viewPartStudentsInformation();//查看一张简单信息的学生表

    void insertStudent(Student student);//注册学生账号


    void deleteStudent(Long id);//注销学生账号










    List<Admin> selectAllAdmins();  //查看所有管理员信息

}
