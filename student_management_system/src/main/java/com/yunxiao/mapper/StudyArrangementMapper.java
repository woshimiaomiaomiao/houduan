package com.yunxiao.mapper;

import com.yunxiao.entity.StudyArrangement;

//管理研学安排相关的数据库操作
public interface StudyArrangementMapper {
    void insertStudyArrangement(StudyArrangement studyArrangement);
    StudyArrangement selectStudyArrangementById(Long id);
    void updateStudyArrangement(StudyArrangement studyArrangement);
    void deleteStudyArrangement(Long id);


}
