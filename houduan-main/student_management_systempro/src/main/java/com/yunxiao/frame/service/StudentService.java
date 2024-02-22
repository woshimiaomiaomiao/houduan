package com.yunxiao.frame.service;

import com.yunxiao.frame.entity.Student;
import com.yunxiao.frame.entity.StudyArrangement;

public interface StudentService extends IUserAuthenticationService,IAnnouncementService,IStudyMaterialService,IStudyTaskService,ISeatReservationService,ILeaveApplicationService{

    // 查看学生信息
    Student viewAllStudentsInformation(String studentId);

    // 修改学生信息
    void alterStudentsInformation(Student student);

    // 研学安排相关方法
    void createStudyArrangement(StudyArrangement studyArrangement);

    StudyArrangement getStudyArrangementById(Long id);

    void updateStudyArrangement(StudyArrangement studyArrangement);

    void deleteStudyArrangement(Long id);
}
