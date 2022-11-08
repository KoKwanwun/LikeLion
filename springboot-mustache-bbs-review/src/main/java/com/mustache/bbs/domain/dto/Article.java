package com.mustache.bbs.domain.dto;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Article2")
@NoArgsConstructor
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    public Article(String title) {
        this.title = title;
    }
}
