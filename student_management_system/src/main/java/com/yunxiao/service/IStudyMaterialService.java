package com.yunxiao.service;

import com.yunxiao.entity.StudyMaterial;

import java.util.List;

//学习资料接口
public interface IStudyMaterialService {
    // 查看学习资料
    List<StudyMaterial> viewStudyMaterials();
    // 发布学习资料
    void postStudyMaterials(StudyMaterial material);
}
