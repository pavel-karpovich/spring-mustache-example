package com.domain;

import java.util.Date;

public class Article {

    public String title;
    public Date publishDate;
    public String author;
    public String body;

    public static Article generate(String tit) {
        Article newArticle = new Article();
        newArticle.title = tit;
        newArticle.publishDate = new Date();
        newArticle.author = "James Joyce";
        newArticle.body = "dawdifghrsdiuofghdsruioghnrdu gnbsweiufb esifpu bse";
        return newArticle;
    }
}
