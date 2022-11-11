package com.mustache.bbs.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nation_wide_hospitals")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Hospital {
    @Id
    private Integer id;
}
