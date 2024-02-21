package com.yunxiao.frame.service;

import com.yunxiao.frame.entity.*;
import com.yunxiao.frame.mapper.StudyMaterialMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService{
    //    具体实现方法
    @Override
    public List<Student> viewAllStudentsInformation() {
        return null;
    }

    @Override
    public void alterStudentsInformation(String studentId, Student student) {

    }

    @Override
    public List<Announcement> viewAnnouncements() {
        return null;
    }

    @Override
    public void postAnnouncements(Announcement announcement) {

    }


//    查看学习资料
    @Override
    @Autowired
    public List<StudyMaterial> viewStudyMaterials() {
// 调用Mapper接口的方法来获取所有学习资料列表

    }

    @Override
    public void postStudyMaterials(StudyMaterial material) {

    }

    @Override
    public List<StudyTask> viewStudyTasks() {
        return null;
    }

    @Override
    public void postStudyTasks(StudyTask task) {

    }

    @Override
    public void register(String username, String password) {

    }

    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public void createLeaveApplication(LeaveApplication leaveApplication) {

    }

    @Override
    public LeaveApplication getLeaveApplicationById(Long id) {
        return null;
    }

    @Override
    public void updateLeaveApplication(LeaveApplication leaveApplication) {

    }

    @Override
    public void deleteLeaveApplication(Long id) {

    }
//    具体实现
}
