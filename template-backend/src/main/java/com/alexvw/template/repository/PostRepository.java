package com.alexvw.template.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.alexvw.template.domain.Post;

public interface PostRepository extends PagingAndSortingRepository<Post, Long> {
}
