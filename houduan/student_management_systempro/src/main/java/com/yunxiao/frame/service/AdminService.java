package com.yunxiao.frame.service;

import com.yunxiao.frame.entity.Student;

import java.util.List;

public interface AdminService extends IUserAuthenticationService,IAnnouncementService,IStudyMaterialService,IStudyTaskService,ISeatReservationService,ILeaveApplicationService{


    // 查看所有学生信息
    List<Student> viewAllStudentsInformation();
    // 修改学生信息
    void alterStudentsInformation(String studentId, Student student);

}
