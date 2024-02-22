package com.yunxiao.frame.service;

import com.yunxiao.frame.entity.StudyTask;

import java.util.List;
//研学任务接口
public interface IStudyTaskService {
    void insertStudyTask(StudyTask studyTask);
    StudyTask selectStudyTaskById(Long id);
    void updateStudyTask(StudyTask studyTask);
    void deleteStudyTask(Long id);
}
