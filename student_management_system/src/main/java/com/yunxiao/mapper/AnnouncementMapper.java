package com.yunxiao.mapper;

import com.yunxiao.entity.Announcement;

//管理公告相关的数据库交互
public interface AnnouncementMapper {
    void insertAnnouncement(Announcement announcement);
    Announcement selectAnnouncementById(Long id);
    void updateAnnouncement(Announcement announcement);
    void deleteAnnouncement(Long id);



}
