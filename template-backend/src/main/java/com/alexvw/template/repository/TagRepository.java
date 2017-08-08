package com.alexvw.template.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.alexvw.template.domain.Tag;

public interface TagRepository extends CrudRepository<Tag, Long> {
	//List<Tag> findByName(@Param("name") String name);
}
