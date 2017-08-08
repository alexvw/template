package com.alexvw.template.domain;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne(targetEntity=ContentType.class, fetch=FetchType.EAGER)
	private ContentType contentType;
	private String contentValue;
	@ManyToOne(targetEntity=User.class, fetch=FetchType.EAGER)
	private User user;
	private Date dateCreated;
	
	public Post(){}

	public Post(Long id, ContentType contentType, String contentValue, User user, Date dateCreated) {
		super();
		this.id = id;
		this.contentType = contentType;
		this.contentValue = contentValue;
		this.user = user;
		this.dateCreated = dateCreated;
	}
}