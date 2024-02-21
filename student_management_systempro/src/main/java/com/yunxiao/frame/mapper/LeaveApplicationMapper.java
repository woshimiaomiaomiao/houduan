package com.yunxiao.frame.mapper;

import com.yunxiao.frame.entity.LeaveApplication;
import org.apache.ibatis.annotations.Mapper;

//负责请假申请和批准相关的数据库操作
@Mapper
public interface LeaveApplicationMapper {
    void insertLeaveApplication(LeaveApplication leaveApplication);
    LeaveApplication selectLeaveApplicationById(Long id);
    void updateLeaveApplication(LeaveApplication leaveApplication);
    void deleteLeaveApplication(Long id);
}
