package com.yunxiao.frame.service;

import com.yunxiao.frame.entity.*;
import com.yunxiao.frame.mapper.SeatReservationMapper;
import com.yunxiao.frame.mapper.StudyArrangementMapper;
import com.yunxiao.frame.mapper.StudyMaterialMapper;
import com.yunxiao.frame.mapper.StudyTaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    private final StudyMaterialMapper studyMaterialMapper;
    private final SeatReservationMapper seatReservationMapper;
    private final StudyTaskMapper studyTaskMapper;
    private final StudyArrangementMapper studyArrangementMapper;

    @Autowired
    public StudentServiceImpl(StudyMaterialMapper studyMaterialMapper, SeatReservationMapper seatReservationMapper,StudyTaskMapper studyTaskMapper,StudyArrangementMapper studyArrangementMapper) {
        this.studyMaterialMapper = studyMaterialMapper;
        this.seatReservationMapper = seatReservationMapper;
        this.studyTaskMapper=studyTaskMapper;
        this.studyArrangementMapper = studyArrangementMapper;
    }

    //    具体实现方法

    @Override
    public List<Announcement> viewAnnouncements() {
        return null;
    }

    @Override
    public void postAnnouncements(Announcement announcement) {

    }


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


    // 座位预约相关方法
    @Override
    public void createSeatReservation(SeatReservation seatReservation) {
        // 实现创建座位预约的逻辑
        seatReservationMapper.insertSeatReservation(seatReservation);
    }

    @Override
    public SeatReservation getSeatReservationById(Long id) {
        // 实现根据座位ID获取该座位目前的预约情况
        return seatReservationMapper.selectSeatReservationById(id);
    }

    @Override
    public void updateSeatReservation(SeatReservation seatReservation) {
        // 实现更新座位预约的逻辑
        //不要这个功能
        seatReservationMapper.updateSeatReservation(seatReservation);
    }

    @Override
    public void deleteSeatReservation(Long id) {
        // 实现删除座位预约的逻辑
        //不要这个功能
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
}
