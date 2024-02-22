package com.yunxiao.frame.service;

import com.yunxiao.frame.entity.SeatReservation;
import com.yunxiao.frame.entity.Student;
import com.yunxiao.frame.entity.StudyArrangement;

import java.util.List;

public interface AdminService extends IUserAuthenticationService,IAnnouncementService,IStudyMaterialService,IStudyTaskService,ILeaveApplicationService{


    // 查看所有学生信息
    List<Student> viewAllStudentsInformation();


    // 修改学生信息
    void alterStudentsInformation(String studentId, Student student);


    // 研学安排相关方法
    void createStudyArrangement(StudyArrangement studyArrangement);

    StudyArrangement getStudyArrangementById(Long id);

    void updateStudyArrangement(StudyArrangement studyArrangement);

    void deleteStudyArrangement(Long id);
}
