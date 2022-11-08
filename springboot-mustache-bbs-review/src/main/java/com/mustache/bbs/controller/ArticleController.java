package com.mustache.bbs.controller;

import com.mustache.bbs.domain.dto.ArticleDto;
import com.mustache.bbs.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/articles")
@Slf4j
public class ArticleController {

    private final ArticleRepository articleRepository;

    public ArticleController(ArticleRepository repository) {
        this.articleRepository = repository;
    }

    @GetMapping("/new")
    public String createArticle(){
        return "articles/new";
    }

    @PostMapping("/post")
    public String articles(ArticleDto articleDto) {
        log.info(articleDto.toString());
        articleRepository.save(articleDto.toEntity());
        return "";
    }
}
