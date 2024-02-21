package com.yunxiao.entity;

import java.time.LocalDateTime;

public class LearningExperience {
    private long experienceId;
    private long studentId;
    private String description;
    private String createTime;

    public LearningExperience() {}

    public LearningExperience(long studentId, String description, String createTime) {
        this.studentId = studentId;
        this.description = description;
        this.createTime = createTime;
    }

    public long getExperienceId() {
        return experienceId;
    }

    public void setExperienceId(long experienceId) {
        this.experienceId = experienceId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String toString() {
        return "LearningExperience{experienceId = " + experienceId + ", studentId = " + studentId + ", description = " + description + ", createTime = " + createTime + "}";
    }
}
