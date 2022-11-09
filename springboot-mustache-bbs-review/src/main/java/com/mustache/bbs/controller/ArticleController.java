package com.mustache.bbs.controller;

import com.mustache.bbs.domain.dto.Article;
import com.mustache.bbs.domain.dto.ArticleDto;
import com.mustache.bbs.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

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

    @GetMapping("/{id}")
    public String selectSingle(@PathVariable Long id, Model model) {
        Optional<Article> optArticle = articleRepository.findById(id);
        if(!optArticle.isEmpty()){
            model.addAttribute("article", optArticle.get());
            return "articles/show";
        } else{
            return "articles/error";
        }
    }

    @PostMapping("/post")
    public String articles(ArticleDto articleDto) {
        log.info(articleDto.toString());
        Article savedArticle = articleRepository.save(articleDto.toEntity());
        return String.format("redirect:/articles/%d", savedArticle.getId());
    }
}
