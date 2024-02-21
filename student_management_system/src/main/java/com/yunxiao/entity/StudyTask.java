package com.yunxiao.entity;

import java.time.LocalDateTime;

public class StudyTask {
    private long taskId;            //任务ID
    private String description;     //描述
    private String startTime;//开始时间
    private String endTime;  //结束时间
    private long responsibleId;     //负责人ID
    private String status;          //任务状态（未开始、进行中、已完成）

    public StudyTask(String description, String startTime, String endTime, long responsibleId, String status) {
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.responsibleId = responsibleId;
        this.status = status;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public long getResponsibleId() {
        return responsibleId;
    }

    public void setResponsibleId(long responsibleId) {
        this.responsibleId = responsibleId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
