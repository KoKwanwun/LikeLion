package com.mustache.bbs.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class ArticleDto {
    private String title;
    private String content;

    public Article toEntity() {
        return new Article(this.title, this.content);
    }
}
