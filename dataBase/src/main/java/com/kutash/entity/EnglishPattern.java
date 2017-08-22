package com.kutash.entity;

import javax.persistence.*;

@Entity
@Table(name = "pattern")
public class EnglishPattern {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String russian;
    private String english;
    private String rule;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRussian() {
        return russian;
    }

    public void setRussian(String russian) {
        this.russian = russian;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }
}
