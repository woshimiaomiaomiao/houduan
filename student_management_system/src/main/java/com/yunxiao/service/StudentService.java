package com.yunxiao.service;

public interface StudentService {
    // 注册账号
    void login();

    // 登录账号
    void logging();

    // 查看学生信息
    void viewAllStudentsInformation();

    // 修改学生信息
    void alterStudentsInformation();

    // 调整学生研学
    void adjustStudentsOrder();

    // 发布学习资料
    void postStudyInformation();

    // 发布研学任务
    void postStudyTasks();

    // 发布公告
    void postNotice();

    // 审核请假调研学
    void examine();

    // 批准是否退出
    void approveQuit();
}
