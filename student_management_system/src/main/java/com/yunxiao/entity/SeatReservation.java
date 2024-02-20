package com.yunxiao.entity;

import java.time.LocalDateTime;

public class SeatReservation {
   private long reservationId;
   private long studentId;
   private long seatId;
   private LocalDateTime startTime;
   private LocalDateTime endTime;

    public SeatReservation() {
    }

    public SeatReservation(long reservationId, long studentId, long seatId, LocalDateTime startTime, LocalDateTime endTime) {
        this.reservationId = reservationId;
        this.studentId = studentId;
        this.seatId = seatId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * 获取
     * @return reservationId
     */
    public long getReservationId() {
        return reservationId;
    }

    /**
     * 设置
     * @param reservationId
     */
    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }

    /**
     * 获取
     * @return studentId
     */
    public long getStudentId() {
        return studentId;
    }

    /**
     * 设置
     * @param studentId
     */
    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    /**
     * 获取
     * @return seatId
     */
    public long getSeatId() {
        return seatId;
    }

    /**
     * 设置
     * @param seatId
     */
    public void setSeatId(long seatId) {
        this.seatId = seatId;
    }

    /**
     * 获取
     * @return startTime
     */
    public LocalDateTime getStartTime() {
        return startTime;
    }

    /**
     * 设置
     * @param startTime
     */
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取
     * @return endTime
     */
    public LocalDateTime getEndTime() {
        return endTime;
    }

    /**
     * 设置
     * @param endTime
     */
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String toString() {
        return "SeatReservation{reservationId = " + reservationId + ", studentId = " + studentId + ", seatId = " + seatId + ", startTime = " + startTime + ", endTime = " + endTime + "}";
    }
}
