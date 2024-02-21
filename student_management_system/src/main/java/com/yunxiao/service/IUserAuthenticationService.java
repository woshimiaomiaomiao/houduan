package com.yunxiao.service;
//注册与登录接口
public interface IUserAuthenticationService {
    // 注册账号
    void register(String username, String password);

    // 登录账号
    boolean login(String username, String password);
}
