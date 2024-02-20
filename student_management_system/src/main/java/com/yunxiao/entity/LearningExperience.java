package com.yunxiao.entity;

import java.time.LocalDateTime;

public class LearningExperience {
   private long experienceId;
   private long studentId;
   private String description;
   private LocalDateTime createTime;

    public LearningExperience() {
    }

    public LearningExperience(long experienceId, long studentId, String description, LocalDateTime createTime) {
        this.experienceId = experienceId;
        this.studentId = studentId;
        this.description = description;
        this.createTime = createTime;
    }

    /**
     * 获取
     * @return experienceId
     */
    public long getExperienceId() {
        return experienceId;
    }

    /**
     * 设置
     * @param experienceId
     */
    public void setExperienceId(long experienceId) {
        this.experienceId = experienceId;
    }

    /**
     * 获取
     * @return studentId
     */
    public long getStudentId() {
        return studentId;
    }

    /**
     * 设置
     * @param studentId
     */
    public void setStudentId(long studentId) {
        this.studentId = studentId;
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
     * @return createTime
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * 设置
     * @param createTime
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String toString() {
        return "LearningExperience{experienceId = " + experienceId + ", studentId = " + studentId + ", description = " + description + ", createTime = " + createTime + "}";
    }
}
