package com.yunxiao.frame.service;

import com.yunxiao.frame.entity.StudyTask;

import java.util.List;
//研学任务接口
public interface IStudyTaskService {
    // 查看研学任务
    List<StudyTask> viewStudyTasks();
    // 发布研学任务
    void postStudyTasks(StudyTask task);
}
