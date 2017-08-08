package com.alexvw.template.domain;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class ContentType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String shortName;
	private String description;
	
	public ContentType(){}

	public ContentType(Long id, String shortName, String description) {
		super();
		this.id = id;
		this.shortName = shortName;
		this.description = description;
	}
}