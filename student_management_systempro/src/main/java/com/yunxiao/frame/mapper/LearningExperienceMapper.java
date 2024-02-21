package com.yunxiao.frame.mapper;

import com.yunxiao.frame.entity.LearningExperience;
import org.apache.ibatis.annotations.Mapper;

//管理学习心得相关的数据库交互
@Mapper
public interface LearningExperienceMapper {
    void insertLearningExperience(LearningExperience learningExperience);
    LearningExperience selectLearningExperienceById(Long id);
    void updateLearningExperience(LearningExperience learningExperience);
    void deleteLearningExperience(Long id);
}
