package com.yunxiao.mapper;

import com.yunxiao.entity.LearningExperience;

//管理学习心得相关的数据库交互
public interface LearningExperienceMapper {
    void insertLearningExperience(LearningExperience learningExperience);
    LearningExperience selectLearningExperienceById(Long id);
    void updateLearningExperience(LearningExperience learningExperience);
    void deleteLearningExperience(Long id);
}
