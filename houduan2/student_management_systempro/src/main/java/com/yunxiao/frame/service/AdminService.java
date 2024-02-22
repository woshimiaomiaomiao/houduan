package com.yunxiao.frame.service;

import com.yunxiao.frame.entity.Admin;
import com.yunxiao.frame.entity.SeatReservation;
import com.yunxiao.frame.entity.Student;
import com.yunxiao.frame.entity.StudyArrangement;

import java.util.List;

public interface AdminService extends IAnnouncementService,IStudyMaterialService,IStudyTaskService,ILeaveApplicationService,ISeatReservationService{



    Admin selectAdmin(Long id); //登陆管理员账号

    void updateStudentPartialInfo(int id);//通过学生id修改学生全部信息

    Student selectStudentInformation(long id);//通过学生id查找学生所有信息

    Student viewPartStudentsInformation();//查看一张简单信息的学生表

    void insertStudent(Student student);//注册学生账号


    void deleteStudent(Long id);//注销学生账号







    // 研学安排相关方法
    void createStudyArrangement(StudyArrangement studyArrangement);

    StudyArrangement getStudyArrangementById(Long id);

    void updateStudyArrangement(StudyArrangement studyArrangement);

    void deleteStudyArrangement(Long id);
}
