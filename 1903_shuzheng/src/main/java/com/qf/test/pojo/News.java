package com.qf.test.pojo;

import java.util.Date;

public class News {
    private int newsId;
    private String title;
    private String author;
    private String source;
    private String content;
    private Date time;

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsId=" + newsId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", source='" + source + '\'' +
                ", content='" + content + '\'' +
                ", time=" + time +
                '}';
    }

    public News(int newsId, String title, String author, String source, String content, Date time) {
        this.newsId = newsId;
        this.title = title;
        this.author = author;
        this.source = source;
        this.content = content;
        this.time = time;
    }

    public News(String title, String author, String source, String content) {
        this.title = title;
        this.author = author;
        this.source = source;
        this.content = content;
    }

    public News(int newsId, String title, String author, String source, String content) {
        this.newsId = newsId;
        this.title = title;
        this.author = author;
        this.source = source;
        this.content = content;
    }

    public News() {
    }
}
