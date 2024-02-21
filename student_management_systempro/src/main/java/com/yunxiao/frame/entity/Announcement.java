package com.yunxiao.frame.entity;

public class Announcement {
    private long announcementId;  //公告ID
    private String title;         //标题
    private String content;       //内容
    private Long publisherId;     //发布者ID

    public Announcement() {
    }

    public Announcement(String title, String content, Long publisherId) {
        this.title = title;
        this.content = content;
        this.publisherId = publisherId;
    }

    /**
     * 获取
     * @return announcementId
     */
    public long getAnnouncementId() {
        return announcementId;
    }

    /**
     * 设置
     * @param announcementId
     */
    public void setAnnouncementId(long announcementId) {
        this.announcementId = announcementId;
    }

    /**
     * 获取
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取
     * @return publisherId
     */
    public Long getPublisherId() {
        return publisherId;
    }

    /**
     * 设置
     * @param publisherId
     */
    public void setPublisherId(Long publisherId) {
        this.publisherId = publisherId;
    }

    public String toString() {
        return "Announcement{announcementId = " + announcementId + ", title = " + title + ", content = " + content + ", publisherId = " + publisherId + "}";
    }
}
