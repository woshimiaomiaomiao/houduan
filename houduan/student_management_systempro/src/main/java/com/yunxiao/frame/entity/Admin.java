package com.yunxiao.frame.entity;

public class Admin {
    private String adminName; // 管理员姓名
    private String adminId; // 管理员账号
    private String adminPassword; // 管理员密码

    public Admin(String adminName, String adminPassword) {
        this.adminName = adminName;
        this.adminPassword = adminPassword;
    }

    /**
     * 获取
     * @return adminName
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * 设置
     * @param adminName
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    /**
     * 获取
     * @return adminId
     */
    public String getAdminId() {
        return adminId;
    }

    /**
     * 设置
     * @param adminId
     */
    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    /**
     * 获取
     * @return adminPassword
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * 设置
     * @param adminPassword
     */
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String toString() {
        return "Admin{adminName = " + adminName + ", adminId = " + adminId + ", adminPassword = " + adminPassword + "}";
    }
}
