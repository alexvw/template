package com.alexvw.template.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Data
public class PostSummary {
	private Long postId;
	private String postType;
	private String postValue;
	private String postUserCredential;
	private List<Tag> postTags;
	private Date dateCreated;
	
	public PostSummary(){}
	

	public PostSummary(Long postId, String postValue, Date dateCreated) {
		super();
		this.postId = postId;
		this.postValue = postValue;
		this.dateCreated = dateCreated;
	}

	public PostSummary(Long postId, String postType, String postValue, String postUserCredential, List<Tag> postTags,
			Date dateCreated) {
		super();
		this.postId = postId;
		this.postType = postType;
		this.postValue = postValue;
		this.postUserCredential = postUserCredential;
		this.postTags = postTags;
		this.dateCreated = dateCreated;
	}
}