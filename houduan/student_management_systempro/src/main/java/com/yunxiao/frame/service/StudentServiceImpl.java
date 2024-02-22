package com.yunxiao.frame.service;

import com.yunxiao.frame.entity.*;
import com.yunxiao.frame.mapper.AnnouncementMapper;
import com.yunxiao.frame.mapper.LeaveApplicationMapper;
import com.yunxiao.frame.mapper.StudyMaterialMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    private final StudyMaterialMapper studyMaterialMapper;
    private final AnnouncementMapper announcementMapper;
    private final LeaveApplicationMapper leaveApplicationMapper;

    public StudentServiceImpl(StudyMaterialMapper studyMaterialMapper,
                              AnnouncementMapper announcementMapper,
                              LeaveApplicationMapper leaveApplicationMapper) {
        this.studyMaterialMapper = studyMaterialMapper;
        this.announcementMapper = announcementMapper;
        this.leaveApplicationMapper = leaveApplicationMapper;
    }

    //    具体实现方法
    @Override
    public List<Announcement> viewAnnouncements() {
        return null;
    }


    //发布公告（无用）
    @Override
    public void postAnnouncements(Announcement announcement) {

    }


    @Override
    public List<StudyMaterial> viewStudyMaterials() {
        return null;
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
    public Student viewAllStudentsInformation(String studentId) {
        return null;
    }

    @Override
    public void alterStudentsInformation(Student student) {

    }


    //申请请假
    @Override
    public void createLeaveApplication(LeaveApplication leaveApplication) {
            leaveApplicationMapper.insertLeaveApplication(leaveApplication);
        }


    @Override
    public LeaveApplication getLeaveApplicationById(Long id) {
        return null;
    }


    //更新请假信息
    @Override
    public void updateLeaveApplication(LeaveApplication leaveApplication) {
    leaveApplicationMapper.updateLeaveApplication(leaveApplication);
    }


    //删除请假信息
    @Override
    public void deleteLeaveApplication(Long id) {
    leaveApplicationMapper.deleteLeaveApplication(id);
    }
}
