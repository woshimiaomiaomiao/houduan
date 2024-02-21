package com.yunxiao.service;

import com.yunxiao.entity.LeaveApplication;

public interface ISeatReservationService {
    void createLeaveApplication(LeaveApplication leaveApplication);

    LeaveApplication getLeaveApplicationById(Long id);

    void updateLeaveApplication(LeaveApplication leaveApplication);

    void deleteLeaveApplication(Long id);
}
