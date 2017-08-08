package com.alexvw.template.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.alexvw.template.domain.PostSummary;

public interface PostService {
	Page<PostSummary> getAll(Pageable pageable);
}