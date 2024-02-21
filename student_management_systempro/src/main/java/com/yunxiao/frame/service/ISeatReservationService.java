package com.yunxiao.frame.service;

import com.yunxiao.frame.entity.LeaveApplication;

public interface ISeatReservationService {
    void createLeaveApplication(LeaveApplication leaveApplication);

    LeaveApplication getLeaveApplicationById(Long id);

    void updateLeaveApplication(LeaveApplication leaveApplication);

    void deleteLeaveApplication(Long id);
}
