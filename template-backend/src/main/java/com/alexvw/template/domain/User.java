package com.alexvw.template.domain;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String credential;
	public User(){}
	public User(Long id, String credential) {
		this.id = id;
		this.credential = credential;
	}
}