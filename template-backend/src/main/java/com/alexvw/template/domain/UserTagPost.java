package com.alexvw.template.domain;

import java.util.Date;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class UserTagPost {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne(targetEntity=Tag.class, fetch=FetchType.EAGER)
	private Tag tag;
	@ManyToOne(targetEntity=Post.class, fetch=FetchType.EAGER)
	private Post post;
	@ManyToOne(targetEntity=User.class, fetch=FetchType.EAGER)
	private User user;
	private Date dateModified;
	
	public UserTagPost(){}

	public UserTagPost(Long id, Tag tag, Post post, User user, Date dateModified) {
		super();
		this.id = id;
		this.tag = tag;
		this.post = post;
		this.user = user;
		this.dateModified = dateModified;
	}
	
}