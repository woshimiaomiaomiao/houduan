package com.yunxiao.frame.mapper;

import com.yunxiao.frame.entity.SeatReservation;
import org.apache.ibatis.annotations.Mapper;

//处理座位预约相关的数据库操作
@Mapper
public interface SeatReservationMapper {
    void insertSeatReservation(SeatReservation seatReservation);
    SeatReservation selectSeatReservationById(Long id);
    void updateSeatReservation(SeatReservation seatReservation);
    void deleteSeatReservation(Long id);


}
