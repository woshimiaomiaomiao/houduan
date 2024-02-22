package com.yunxiao.frame.mapper;

import com.yunxiao.frame.entity.StudyMaterial;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//负责学习资料相关的数据库交互
@Mapper
public interface StudyMaterialMapper {
    void insertStudyMaterial(StudyMaterial studyMaterial);

    StudyMaterial selectStudyMaterialById(Long id);

    void updateStudyMaterial(StudyMaterial studyMaterial);

    void deleteStudyMaterial(Long id);

    List<StudyMaterial> selectAllStudyMaterials();


}
