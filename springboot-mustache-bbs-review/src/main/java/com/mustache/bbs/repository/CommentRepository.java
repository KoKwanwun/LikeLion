package com.mustache.bbs.repository;

import com.mustache.bbs.domain.Article;
import com.mustache.bbs.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    @Query(value = "SELECT * FROM comment where comment.article_id = :id", nativeQuery = true)
    List<Comment> findByArticleId(Long id);
}
