package com.yunxiao.mapper;

import com.yunxiao.entity.LeaveApplication;

//负责请假申请和批准相关的数据库操作
public interface LeaveApplicationMapper {
    void insertLeaveApplication(LeaveApplication leaveApplication);
    LeaveApplication selectLeaveApplicationById(Long id);
    void updateLeaveApplication(LeaveApplication leaveApplication);
    void deleteLeaveApplication(Long id);
}
