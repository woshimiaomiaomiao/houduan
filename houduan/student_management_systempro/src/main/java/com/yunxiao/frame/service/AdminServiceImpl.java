package com.yunxiao.frame.service;

import com.yunxiao.frame.entity.*;
import com.yunxiao.frame.mapper.AnnouncementMapper;
import com.yunxiao.frame.mapper.LeaveApplicationMapper;
import com.yunxiao.frame.mapper.StudyMaterialMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService{
    private final StudyMaterialMapper studyMaterialMapper;
    private final AnnouncementMapper announcementMapper;
    private final LeaveApplicationMapper leaveApplicationMapper;

    @Autowired
    public AdminServiceImpl(StudyMaterialMapper studyMaterialMapper, AnnouncementMapper announcementMapper,
                            LeaveApplicationMapper leaveApplicationMapper) {
        this.studyMaterialMapper = studyMaterialMapper;

        this.announcementMapper = announcementMapper;
        this.leaveApplicationMapper = leaveApplicationMapper;
    }

    //    具体实现方法
    @Override
    public List<Student> viewAllStudentsInformation() {
        return null;
    }

    @Override
    public void alterStudentsInformation(String studentId, Student student) {

    }


    //查看公告
    @Override
    public List<Announcement> viewAnnouncements() {
        return null;
    }


    //发布公告
    @Override
    public void postAnnouncements(Announcement announcement) {
    announcementMapper.updateAnnouncement(announcement);
    }


//    查看学习资料
    @Override
    @Autowired
    public List<StudyMaterial> viewStudyMaterials() {
// 调用Mapper接口的方法来获取所有学习资料列表
return studyMaterialMapper.selectAllStudyMaterials();
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


    //申请请假（无用）
    @Override
    public void createLeaveApplication(LeaveApplication leaveApplication) {

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
//    具体实现
}
