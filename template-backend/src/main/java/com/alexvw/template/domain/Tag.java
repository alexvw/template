package com.alexvw.template.domain;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Tag {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String tagName;
	
	public Tag(){}

	public Tag(Long id, String tagName) {
		super();
		this.id = id;
		this.tagName = tagName;
	}
}