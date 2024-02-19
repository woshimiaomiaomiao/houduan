package com.yunxiao.service;

public interface AdminService {
    // 注册账号
    void login();

    // 登录账号
    void log();

    // 查看研学安排
    void viewStudyArrangements();

    // 查看研学任务
    void viewStudyTasks();

    // 查看通知
    void viewNotice();

    // 查看学习资料
    void viewStudyInformation();

    // 调整或请假
    void adjustOrLeave();

    // 申请退出书院
    void quitYunding();

    // 座位预约
    void orderSeat();

    // 学习感悟
    void learningExperience();
}
