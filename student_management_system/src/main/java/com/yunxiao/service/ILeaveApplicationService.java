package com.yunxiao.service;

import com.yunxiao.entity.LeaveApplication;

public interface ILeaveApplicationService {
    void createLeaveApplication(LeaveApplication leaveApplication);

    LeaveApplication getLeaveApplicationById(Long id);

    void updateLeaveApplication(LeaveApplication leaveApplication);

    void deleteLeaveApplication(Long id);
}
