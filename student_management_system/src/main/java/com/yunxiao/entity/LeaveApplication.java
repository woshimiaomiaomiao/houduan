package com.yunxiao.entity;

import java.time.LocalDateTime;

public class LeaveApplication {
   private long applicationId;
   private long studentId;
   private String reason;
   private LocalDateTime startTime;
   private LocalDateTime endTime;
   private String status;//待审批（Pending）已批准（Approved）已拒绝（Rejected）已取消（Canceled）已完成（Completed）
}
