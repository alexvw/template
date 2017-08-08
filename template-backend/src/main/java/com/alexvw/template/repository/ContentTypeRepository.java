package com.alexvw.template.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.alexvw.template.domain.ContentType;

public interface ContentTypeRepository extends CrudRepository<ContentType, Long> {
	List<ContentType> findByShortName(@Param("shortname") String shortName);
}
