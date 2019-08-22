package com.qf.test.controller;

import com.qf.test.pojo.News;
import com.qf.test.service.INewsService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/news")
public class NewsController {
    @Autowired
    private INewsService newsService;

    public INewsService getNewsService() {
        return newsService;
    }

    public void setNewsService(INewsService newsService) {
        this.newsService = newsService;
    }

    @RequestMapping("/add")
    public String addNews (String title,String author,String source,String content){
        if (title != "" && author !="" && source != "" && content !=""){
            News news = new News(title,author,source,content);
            int i = newsService.addNews(news);
            if (i>0){
                return "index";
            }else {
                return "wrong";
            }
        }else {
            return "wrong";
        }



    }

    @RequestMapping("/select")
    public ModelAndView selectNews(){
        ModelAndView modelAndView = new ModelAndView();
        List<News> newsList =  newsService.selectNews();
        modelAndView.addObject("news",newsList);
        modelAndView.setViewName("show");
        return modelAndView;
    }


}
