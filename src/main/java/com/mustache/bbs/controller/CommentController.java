package com.mustache.bbs.controller;

import com.mustache.bbs.domain.Article;
import com.mustache.bbs.domain.Comment;
import com.mustache.bbs.dto.ArticleDto;
import com.mustache.bbs.dto.CommentDto;
import com.mustache.bbs.repository.CommentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/comment")
public class CommentController {
    private final CommentRepository commentRepository;

    public CommentController(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @PostMapping("/{id}/post")
    public String comment(@PathVariable Long id, CommentDto commentDto) {
        commentRepository.save(commentDto.toEntity());
        return String.format("redirect:/articles/%d", id);
    }
}
