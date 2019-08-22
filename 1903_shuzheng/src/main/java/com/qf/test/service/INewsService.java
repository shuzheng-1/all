package com.qf.test.service;

import com.qf.test.pojo.News;

import java.util.List;

public interface INewsService {

    public int addNews (News news);

    public List<News> selectNews();

    public News selectNewsById(int newsId);

    public int  updateNews(News news);

    public int deleteNews(int newsId);


}
