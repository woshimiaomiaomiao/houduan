package com.yunxiao.entity;

public class StudyArrangement {
   private long arrangementId;
   private String studentId;
   private String studyTime;

    public StudyArrangement() {
    }

    public StudyArrangement(long arrangementId, String studentId, String studyTime) {
        this.arrangementId = arrangementId;
        this.studentId = studentId;
        this.studyTime = studyTime;
    }

    /**
     * 获取
     * @return arrangementId
     */
    public long getArrangementId() {
        return arrangementId;
    }

    /**
     * 设置
     * @param arrangementId
     */
    public void setArrangementId(long arrangementId) {
        this.arrangementId = arrangementId;
    }

    /**
     * 获取
     * @return studentId
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * 设置
     * @param studentId
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * 获取
     * @return studyTime
     */
    public String getStudyTime() {
        return studyTime;
    }

    /**
     * 设置
     * @param studyTime
     */
    public void setStudyTime(String studyTime) {
        this.studyTime = studyTime;
    }

    public String toString() {
        return "StudyArrangement{arrangementId = " + arrangementId + ", studentId = " + studentId + ", studyTime = " + studyTime + "}";
    }
}
