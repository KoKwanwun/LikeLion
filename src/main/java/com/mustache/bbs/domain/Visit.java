package com.mustache.bbs.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Builder
public class Visit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "hospital_id")   // foreign key의 컬럼명
    private Hospital hospital;

    @ManyToOne
    @JoinColumn(name = "user_id")   // foreign key의 컬럼명
    private User user;

    private String disease;

    private float amount;
}
