package com.yunxiao.entity;

import java.time.LocalDateTime;

//学习资料实体类
public class StudyMaterial {
   private long materialld;     //材料ID
   private String title;        //标题
   private String description;  //描述
   private long uploaderId;     //上传者ID
   private String materialPath; //资料链接或路径

    public StudyMaterial() {
    }

    public StudyMaterial(long materialld, String title, String description, long uploaderId, String materialPath) {
        this.materialld = materialld;
        this.title = title;
        this.description = description;
        this.uploaderId = uploaderId;
        this.materialPath = materialPath;
    }

    /**
     * 获取
     * @return materialld
     */
    public long getMaterialld() {
        return materialld;
    }

    /**
     * 设置
     * @param materialld
     */
    public void setMaterialld(long materialld) {
        this.materialld = materialld;
    }

    /**
     * 获取
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取
     * @return uploaderId
     */
    public long getUploaderId() {
        return uploaderId;
    }

    /**
     * 设置
     * @param uploaderId
     */
    public void setUploaderId(long uploaderId) {
        this.uploaderId = uploaderId;
    }

    /**
     * 获取
     * @return materialPath
     */
    public String getMaterialPath() {
        return materialPath;
    }

    /**
     * 设置
     * @param materialPath
     */
    public void setMaterialPath(String materialPath) {
        this.materialPath = materialPath;
    }

    public String toString() {
        return "StudyMaterial{materialld = " + materialld + ", title = " + title + ", description = " + description + ", uploaderId = " + uploaderId + ", materialPath = " + materialPath + "}";
    }
}
