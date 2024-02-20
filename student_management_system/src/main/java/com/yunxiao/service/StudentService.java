package com.yunxiao.service;

import com.yunxiao.entity.Student;

public interface StudentService extends IUserAuthentication,IAnnouncementService,IStudyMaterialService,IStudyTaskService{

    // 查看学生信息
    Student viewAllStudentsInformation(String studentId);

    // 修改学生信息
    void alterStudentsInformation(Student student);

}
