package com.yunxiao.entity;

import java.time.LocalDateTime;

public class StudyTask {
   private long taskId;            //任务ID
   private String description;     //描述
   private LocalDateTime startTime;//开始时间
   private LocalDateTime endTime;  //结束时间
   private long responsibleId;     //负责人ID
   private String status;          //任务状态（未开始、进行中、已完成）

    public StudyTask() {
    }

    public StudyTask(long taskId, String description, LocalDateTime startTime, LocalDateTime endTime, long responsibleId, String status) {
        this.taskId = taskId;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.responsibleId = responsibleId;
        this.status = status;
    }

    /**
     * 获取
     * @return taskId
     */
    public long getTaskId() {
        return taskId;
    }

    /**
     * 设置
     * @param taskId
     */
    public void setTaskId(long taskId) {
        this.taskId = taskId;
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
     * @return startTime
     */
    public LocalDateTime getStartTime() {
        return startTime;
    }

    /**
     * 设置
     * @param startTime
     */
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取
     * @return endTime
     */
    public LocalDateTime getEndTime() {
        return endTime;
    }

    /**
     * 设置
     * @param endTime
     */
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取
     * @return responsibleId
     */
    public long getResponsibleId() {
        return responsibleId;
    }

    /**
     * 设置
     * @param responsibleId
     */
    public void setResponsibleId(long responsibleId) {
        this.responsibleId = responsibleId;
    }

    /**
     * 获取
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return "StudyTask{taskId = " + taskId + ", description = " + description + ", startTime = " + startTime + ", endTime = " + endTime + ", responsibleId = " + responsibleId + ", status = " + status + "}";
    }
}
