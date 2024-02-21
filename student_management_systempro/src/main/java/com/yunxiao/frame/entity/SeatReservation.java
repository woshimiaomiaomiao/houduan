package com.yunxiao.frame.entity;

public class SeatReservation {
    private long reservationId;
    private long studentId;
    private long seatId;
    private String startTime;
    private String endTime;

    public SeatReservation() {
    }

    public SeatReservation(long studentId, long seatId, String startTime, String endTime) {

        this.studentId = studentId;
        this.seatId = seatId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getReservationId() {
        return reservationId;
    }

    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getSeatId() {
        return seatId;
    }

    public void setSeatId(long seatId) {
        this.seatId = seatId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String toString() {
        return "SeatReservation{reservationId = " + reservationId + ", studentId = " + studentId + ", seatId = " + seatId + ", startTime = " + startTime + ", endTime = " + endTime + "}";
    }
}
