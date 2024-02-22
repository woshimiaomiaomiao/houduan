package com.yunxiao.frame.service;

import com.yunxiao.frame.entity.Student;
import com.yunxiao.frame.entity.StudyArrangement;

public interface StudentService extends IAnnouncementService,IStudyMaterialService,IStudyTaskService,ISeatReservationService,ILeaveApplicationService,ILearningExperience{



    //学生独属方法
    Student viewAllStudentsInformation(long studentId);

    Student login(Long id, long password);//登录学生账号
    void updateStudent(Student student);//修改学生信息


    // 研学安排相关方法
    void createStudyArrangement(StudyArrangement studyArrangement);

    StudyArrangement getStudyArrangementById(Long id);

    void updateStudyArrangement(StudyArrangement studyArrangement);

    void deleteStudyArrangement(Long id);
}
