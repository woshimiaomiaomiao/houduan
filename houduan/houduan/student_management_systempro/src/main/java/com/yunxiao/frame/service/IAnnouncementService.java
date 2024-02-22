package com.yunxiao.frame.service;

import com.yunxiao.frame.entity.Announcement;

import java.util.List;
//通知公告接口
public interface IAnnouncementService {
    void insertAnnouncement(Announcement announcement);
    Announcement selectAnnouncementById(Long id);
    void updateAnnouncement(Announcement announcement);
    void deleteAnnouncement(Long id);
}
