package com.yunxiao.frame.mapper;

import com.yunxiao.frame.entity.StudyTask;
import org.apache.ibatis.annotations.Mapper;

//处理研学任务相关的数据库操作
@Mapper
public interface StudyTaskMapper {
    void insertStudyTask(StudyTask studyTask);
    StudyTask selectStudyTaskById(Long id);
    void updateStudyTask(StudyTask studyTask);
    void deleteStudyTask(Long id);
}
