package com.yunxiao.frame.entity;

public class Student {
    private long studentId; // 学号/账号
    private String studentPassword; // 密码
    private String studentName; // 姓名
    private String gender; // 性别
    private String collegeClass; // 学院和班级
    private int period; // 期数
    private String direction; // 方向
    private String awardExperience; // 获奖经历

    public Student(String studentPassword, String studentName) {
        this.studentPassword = studentPassword;
        this.studentName = studentName;
    }

    public Student() {
    }

    public Student(int studentId, String studentPassword, String studentName, String gender, String collegeClass, int period, String direction, String awardExperience) {
        this.studentId = studentId;
        this.studentPassword = studentPassword;
        this.studentName = studentName;
        this.gender = gender;
        this.collegeClass = collegeClass;
        this.period = period;
        this.direction = direction;
        this.awardExperience = awardExperience;
    }

    /**
     * 获取
     * @return studentId
     */
    public int getStudentId() {
        return (int) studentId;
    }

    /**
     * 设置
     * @param studentId
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * 获取
     * @return studentPassword
     */
    public String getStudentPassword() {
        return studentPassword;
    }

    /**
     * 设置
     * @param studentPassword
     */
    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    /**
     * 获取
     * @return studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * 设置
     * @param studentName
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return collegeClass
     */
    public String getCollegeClass() {
        return collegeClass;
    }

    /**
     * 设置
     * @param collegeClass
     */
    public void setCollegeClass(String collegeClass) {
        this.collegeClass = collegeClass;
    }

    /**
     * 获取
     * @return period
     */
    public int getPeriod() {
        return period;
    }

    /**
     * 设置
     * @param period
     */
    public void setPeriod(int period) {
        this.period = period;
    }

    /**
     * 获取
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * 设置
     * @param direction
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * 获取
     * @return awardExperience
     */
    public String getAwardExperience() {
        return awardExperience;
    }

    /**
     * 设置
     * @param awardExperience
     */
    public void setAwardExperience(String awardExperience) {
        this.awardExperience = awardExperience;
    }

    public String toString() {
        return "Student{studentId = " + studentId + ", studentPassword = " + studentPassword + ", studentName = " + studentName + ", gender = " + gender + ", collegeClass = " + collegeClass + ", period = " + period + ", direction = " + direction + ", awardExperience = " + awardExperience + "}";
    }
}
