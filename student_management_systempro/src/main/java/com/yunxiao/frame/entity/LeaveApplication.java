package com.yunxiao.frame.entity;

public class LeaveApplication {
   private long applicationId;
   private long studentId;
   private String reason;
   private String startTime;
   private String endTime;
   private String status;//待审批（Pending）已批准（Approved）已拒绝（Rejected）已取消（Canceled）已完成（Completed）

   public LeaveApplication(long studentId, String reason, String startTime, String endTime, String status) {
      this.studentId = studentId;
      this.reason = reason;
      this.startTime = startTime;
      this.endTime = endTime;
      this.status = status;
   }

   public long getApplicationId() {
      return applicationId;
   }

   public void setApplicationId(long applicationId) {
      this.applicationId = applicationId;
   }

   public long getStudentId() {
      return studentId;
   }

   public void setStudentId(long studentId) {
      this.studentId = studentId;
   }

   public String getReason() {
      return reason;
   }

   public void setReason(String reason) {
      this.reason = reason;
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

   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }
}
