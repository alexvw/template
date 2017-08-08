package com.alexvw.template.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.alexvw.template.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findByCredential(@Param("credential") String credential);
}
