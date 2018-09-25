package com.example.technicalTest.service;

import com.example.technicalTest.model.Article;

import java.util.List;

/**
 * Created by pasindu on 3/8/19.
 */
public interface ArticalService {

    public List<Article> getAllArticles();

    public Article getArticleById(Long id);

    public void saveOrUpdateArticle(Article article);

    public void deleteArticle(Long id);


}
