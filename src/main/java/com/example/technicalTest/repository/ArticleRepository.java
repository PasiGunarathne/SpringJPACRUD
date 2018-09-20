package com.example.technicalTest.repository;

import com.example.technicalTest.model.Article;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by pasindu on 3/8/19.
 */
public interface ArticleRepository extends CrudRepository<Article, Long> {



}
