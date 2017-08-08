package com.alexvw.template.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.alexvw.template.domain.Tag;
import com.alexvw.template.domain.UserTagPost;

public interface UserTagPostRepository extends CrudRepository<UserTagPost, Long> {
	List<UserTagPost> findByPost(@Param("post_id") Long post);
}
