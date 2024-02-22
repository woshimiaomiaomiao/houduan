package com.yunxiao.frame.service;

import com.yunxiao.frame.entity.LearningExperience;

public interface ILearningExperience {
    void insertLearningExperience(LearningExperience learningExperience);
    LearningExperience selectLearningExperienceById(Long id);
    void updateLearningExperience(LearningExperience learningExperience);
    void deleteLearningExperience(Long id);
}
