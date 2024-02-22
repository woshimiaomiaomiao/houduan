package com.yunxiao.frame.service;

import com.yunxiao.frame.entity.StudyMaterial;

import java.util.List;

//学习资料接口
public interface IStudyMaterialService {
    // 查看学习资料
    List<StudyMaterial> viewStudyMaterials();

    // 修改学习资料
    void updateStudyMaterial(StudyMaterial studyMaterial);

    //增加学习资料
    void insertStudyMaterial(StudyMaterial studyMaterial);

    //删除学习资料
    void deleteStudyMaterial(Long id);
}
