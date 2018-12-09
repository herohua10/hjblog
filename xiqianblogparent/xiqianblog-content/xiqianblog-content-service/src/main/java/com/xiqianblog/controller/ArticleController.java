package com.xiqianblog.controller;

import com.xiqianblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

}
