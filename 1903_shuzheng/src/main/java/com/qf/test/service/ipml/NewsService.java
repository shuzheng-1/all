package com.qf.test.service.ipml;

import com.qf.test.mapper.NewsMapper;
import com.qf.test.pojo.News;
import com.qf.test.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService implements INewsService {
    @Autowired
    private NewsMapper newsMapper;

    public NewsMapper getNewsMapper() {
        return newsMapper;
    }

    public void setNewsMapper(NewsMapper newsMapper) {
        this.newsMapper = newsMapper;
    }

    @Override
    public int addNews(News news) {

        return  newsMapper.addNews(news);
    }

    public List<News> selectNews(){

        return  newsMapper.selectNews();
    }

    public News selectNewsById(int newsId){

        return newsMapper.selectNewsById(newsId);
    }

    public int  updateNews(News news){

        return newsMapper.updateNews(news);
    }

    public int deleteNews(int newsId){
        return newsMapper.deleteNews(newsId);
    }

}
