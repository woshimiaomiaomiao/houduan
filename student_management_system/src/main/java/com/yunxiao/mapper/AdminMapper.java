package com.yunxiao.mapper;

import com.yunxiao.entity.Admin;

//负责管理员信息相关的数据库操作。
public interface AdminMapper {
    void insertAdmin(Admin admin);  //增
    Admin selectAdminById(Long id); //查
    void updateAdmin(Admin admin);  //改
    void deleteAdmin(Long id);     //删
}
