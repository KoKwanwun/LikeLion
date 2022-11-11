package com.mustache.bbs.dto;

import com.mustache.bbs.domain.Article;
import com.mustache.bbs.domain.Comment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class CommentDto {
    private Long id;
    private Long articleId;
    private String commentContent;
    private String user;

    public Comment toEntity() {
        return new Comment(this.id, this.articleId, this.commentContent, this.user);
    }
}
