package com.newswebsite.repository;

import org.springframework.data.repository.CrudRepository;

import com.newswebsite.domain.TrendingTopic;

public interface TrendingTopicRepository extends CrudRepository<TrendingTopic, Long> {

}
