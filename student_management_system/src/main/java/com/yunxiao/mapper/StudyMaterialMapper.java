package com.yunxiao.mapper;

import com.yunxiao.entity.StudyMaterial;

//负责学习资料相关的数据库交互
public interface StudyMaterialMapper {
    void insertStudyMaterial(StudyMaterial studyMaterial);
    StudyMaterial selectStudyMaterialById(Long id);
    void updateStudyMaterial(StudyMaterial studyMaterial);
    void deleteStudyMaterial(Long id);



}
