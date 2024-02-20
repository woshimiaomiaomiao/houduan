package com.yunxiao.service;

import com.yunxiao.entity.Student;

import java.util.List;

public interface AdminService extends IUserAuthentication,IAnnouncementService,IStudyMaterialService,IStudyTaskService{


    // 查看所有学生信息
    List<Student> viewAllStudentsInformation();
    // 修改学生信息
    void alterStudentsInformation(String studentId, Student student);

}
