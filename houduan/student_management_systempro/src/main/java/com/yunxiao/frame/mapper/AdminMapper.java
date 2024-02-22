package com.yunxiao.frame.mapper;

import com.yunxiao.frame.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//负责管理员信息相关的数据库操作。
@Mapper
public interface AdminMapper {
    void insertAdmin(Admin admin);  //增
    Admin selectAdmin(Long id); //查
    void deleteAdmin(Long id);     //删
    List<Admin> selectAllAdmins();

    void updateAdminPassword(int id);
}
