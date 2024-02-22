package com.yunxiao.frame.mapper;

import com.yunxiao.frame.entity.StudyArrangement;
import org.apache.ibatis.annotations.Mapper;

//管理研学安排相关的数据库操作
@Mapper
public interface StudyArrangementMapper {
    void insertStudyArrangement(StudyArrangement studyArrangement);
    StudyArrangement selectStudyArrangementById(Long id);
    void updateStudyArrangement(StudyArrangement studyArrangement);
    void deleteStudyArrangement(Long id);


}
