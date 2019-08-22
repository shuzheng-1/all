package com.qf.test.controller;

import com.qf.test.pojo.News;
import com.qf.test.service.INewsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("update")
public class UpdateController {
    @Autowired
    private INewsService newsService;

    public INewsService getNewsService() {
        return newsService;
    }

    public void setNewsService(INewsService newsService) {
        this.newsService = newsService;
    }

    @RequestMapping("/selectById")
    public ModelAndView selectNewsById(@RequestParam(value = "newsid") int newsId){
        ModelAndView modelAndView = new ModelAndView();
        News news = newsService.selectNewsById(newsId);
        modelAndView.addObject("newById",news);
        modelAndView.setViewName("update");
        return modelAndView;
    }
    @RequestMapping("/update")
    public String updateNews (News news){
        int result = newsService.updateNews(news);
        if (result>0){
            return "success";
        }else {
            return "no";
        }

    }

    @RequestMapping("/delete")
    public String deleteNews(@RequestParam(value = "newsid") int newsId){
       int i =  newsService.deleteNews(newsId);
       if(i>0){
           return "redirect:/index.jsp";
       }else{
           return "false";
       }
    }

}
