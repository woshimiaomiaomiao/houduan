package com.yunxiao.frame.service;

import com.yunxiao.frame.entity.LeaveApplication;
import com.yunxiao.frame.entity.SeatReservation;

//座位预约接口
public interface ISeatReservationService {
    void createLeaveApplication(LeaveApplication leaveApplication);

    LeaveApplication getLeaveApplicationById(Long id);

    void updateLeaveApplication(LeaveApplication leaveApplication);

    void deleteLeaveApplication(Long id);

    // 座位预约相关方法
    void createSeatReservation(SeatReservation seatReservation);

    SeatReservation getSeatReservationById(Long id);

    void updateSeatReservation(SeatReservation seatReservation);

    void deleteSeatReservation(Long id);
}
