package com.yunxiao.frame.mapper;

import com.yunxiao.frame.entity.Announcement;
import org.apache.ibatis.annotations.Mapper;

//管理公告相关的数据库交互
@Mapper
public interface AnnouncementMapper {
    void insertAnnouncement(Announcement announcement);
    Announcement selectAnnouncementById(Long id);
    void updateAnnouncement(Announcement announcement);
    void deleteAnnouncement(Long id);



}
