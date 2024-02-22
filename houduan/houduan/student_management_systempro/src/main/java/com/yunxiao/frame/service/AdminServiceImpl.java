package com.yunxiao.frame.service;

import com.yunxiao.frame.entity.*;
import com.yunxiao.frame.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService,ISeatReservationService {
    private final StudyMaterialMapper studyMaterialMapper;
    private final SeatReservationMapper seatReservationMapper;

    private final StudyTaskMapper studyTaskMapper;
    private final StudyArrangementMapper studyArrangementMapper;

    private final AnnouncementMapper announcementMapper;
    private final LeaveApplicationMapper leaveApplicationMapper;
    @Autowired
    public AdminServiceImpl(StudyMaterialMapper studyMaterialMapper, SeatReservationMapper seatReservationMapper,
                            StudyTaskMapper studyTaskMapper,StudyArrangementMapper studyArrangementMapper,
                            AnnouncementMapper announcementMapper,LeaveApplicationMapper leaveApplicationMapper) {
        this.studyMaterialMapper = studyMaterialMapper;
        this.seatReservationMapper = seatReservationMapper;
        this.studyTaskMapper=studyTaskMapper;
        this.studyArrangementMapper = studyArrangementMapper;
        this.announcementMapper = announcementMapper;
        this.leaveApplicationMapper = leaveApplicationMapper;
    }


//登录，注册，注销方法的实现
    @Override
    public void register(String username, String password) {

    }

    @Override
    public boolean login(String username, String password) {
        return false;
    }




    //一些管理员特有方法的实现
    @Override
    public List<Student> viewAllStudentsInformation() {
        // 实现查看所有学生信息逻辑
        return null;
    }

    @Override
    public void alterStudentsInformation(String studentId, Student student) {
        // 实现修改学生信息逻辑
    }





    //学习资料有关方法
    //增加新的学习资料
    @Override
    public void insertStudyMaterial(StudyMaterial studyMaterial) {
        studyMaterialMapper.insertStudyMaterial(studyMaterial);
    }


    //删除学习资料
    @Override
    public void deleteStudyMaterial(Long id) {
        studyMaterialMapper.deleteStudyMaterial(id);
    }


    //更新学习资料
    @Override
    public void updateStudyMaterial(StudyMaterial studyMaterial) {
        studyMaterialMapper.updateStudyMaterial(studyMaterial);
    }


    //    查看学习资料
    @Override
    public List<StudyMaterial> viewStudyMaterials() {
        // 调用Mapper接口的方法来获取所有学习资料列表
        return studyMaterialMapper.selectAllStudyMaterials();
    }





    // 座位预约相关方法
    @Override
    public void createSeatReservation(SeatReservation seatReservation) {
        // 实现创建座位预约的逻辑
        //目前不需要
        seatReservationMapper.insertSeatReservation(seatReservation);
    }

    @Override
    public SeatReservation getSeatReservationById(Long id) {
        // 实现根据ID获取座位预约的逻辑
        //目前不需要
        return seatReservationMapper.selectSeatReservationById(id);
    }

    @Override
    public void updateSeatReservation(SeatReservation seatReservation) {
        // 实现更新座位预约的逻辑
        //目前不需要
        seatReservationMapper.updateSeatReservation(seatReservation);
    }

    @Override
    public void deleteSeatReservation(Long id) {
        // 实现删除座位预约的逻辑
        //目前不需要
        seatReservationMapper.deleteSeatReservation(id);
    }




    //研学任务相关方法
    @Override
    public void insertStudyTask(StudyTask studyTask) {
        studyTaskMapper.insertStudyTask(studyTask);
        //实现增加研学任务的逻辑
    }

    @Override
    public StudyTask selectStudyTaskById(Long id) {
        return studyTaskMapper.selectStudyTaskById(id);
        //实现通过id找到研学任务的逻辑
    }

    @Override
    public void updateStudyTask(StudyTask studyTask) {
        studyTaskMapper.updateStudyTask(studyTask);
        //实现更新研学任务的逻辑
    }

    @Override
    public void deleteStudyTask(Long id) {
        studyTaskMapper.deleteStudyTask(id);
        //实现删除研学任务的逻辑
    }




    // 研学安排相关方法
    @Override
    public void createStudyArrangement(StudyArrangement studyArrangement) {
        studyArrangementMapper.insertStudyArrangement(studyArrangement);
    }

    @Override
    public StudyArrangement getStudyArrangementById(Long id) {
        return studyArrangementMapper.selectStudyArrangementById(id);
    }

    @Override
    public void updateStudyArrangement(StudyArrangement studyArrangement) {
        studyArrangementMapper.updateStudyArrangement(studyArrangement);
    }

    @Override
    public void deleteStudyArrangement(Long id) {
        studyArrangementMapper.deleteStudyArrangement(id);
    }




    //请假信息相关方法
// 创建请假信息
    @Override
    public void createLeaveApplication(LeaveApplication leaveApplication) {
        leaveApplicationMapper.insertLeaveApplication(leaveApplication);
    }

    // 根据ID获取请假信息
    @Override
    public LeaveApplication getLeaveApplicationById(Long id) {
        return leaveApplicationMapper.selectLeaveApplicationById(id);
    }

    // 更新请假信息
    @Override
    public void updateLeaveApplication(LeaveApplication leaveApplication) {
        leaveApplicationMapper.updateLeaveApplication(leaveApplication);
    }

    // 删除请假信息
    @Override
    public void deleteLeaveApplication(Long id) {
        leaveApplicationMapper.deleteLeaveApplication(id);
    }





    //通知公告相关方法

    //增加通知公告
    @Override
    public void insertAnnouncement(Announcement announcement) {
        announcementMapper.insertAnnouncement(announcement);
    }


    //通过ID，查找通知公告
    @Override
    public Announcement selectAnnouncementById(Long id) {
        return announcementMapper.selectAnnouncementById(id);
    }


    //修改通知公告
    @Override
    public void updateAnnouncement(Announcement announcement) {
        announcementMapper.updateAnnouncement(announcement);
    }


    //删除通知公告
    @Override
    public void deleteAnnouncement(Long id) {
        announcementMapper.deleteAnnouncement(id);
    }

}
