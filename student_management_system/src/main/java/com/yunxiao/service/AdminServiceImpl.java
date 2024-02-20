package com.yunxiao.service;

import com.yunxiao.entity.Announcement;
import com.yunxiao.entity.Student;
import com.yunxiao.entity.StudyMaterial;
import com.yunxiao.entity.StudyTask;
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
//    具体实现
}
