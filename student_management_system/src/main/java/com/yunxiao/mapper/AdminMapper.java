package com.yunxiao.mapper;

import com.yunxiao.entity.Admin;

import java.util.List;

//负责管理员信息相关的数据库操作。
public interface AdminMapper {
    void insertAdmin(Admin admin);  //增
    Admin selectAdmin(Long id); //查
    void deleteAdmin(Long id);     //删
    List<Admin> selectAllAdmins();

    void updateAdminPassword(int id);
}
