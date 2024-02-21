package com.yunxiao.mapper;

import com.yunxiao.entity.StudyTask;

//处理研学任务相关的数据库操作
public interface StudyTaskMapper {
    void insertStudyTask(StudyTask studyTask);
    StudyTask selectStudyTaskById(Long id);
    void updateStudyTask(StudyTask studyTask);
    void deleteStudyTask(Long id);
}
