package com.yunxiao.mapper;

import com.yunxiao.entity.SeatReservation;

//处理座位预约相关的数据库操作
public interface SeatReservationMapper {
    void insertSeatReservation(SeatReservation seatReservation);
    SeatReservation selectSeatReservationById(Long id);
    void updateSeatReservation(SeatReservation seatReservation);
    void deleteSeatReservation(Long id);



}
