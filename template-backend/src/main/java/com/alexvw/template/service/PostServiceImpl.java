package com.alexvw.template.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import com.alexvw.template.domain.ContentType;
import com.alexvw.template.domain.Post;
import com.alexvw.template.domain.PostSummary;
import com.alexvw.template.domain.Tag;
import com.alexvw.template.domain.User;
import com.alexvw.template.domain.UserTagPost;
import com.alexvw.template.repository.ContentTypeRepository;
import com.alexvw.template.repository.PostRepository;
import com.alexvw.template.repository.TagRepository;
import com.alexvw.template.repository.UserRepository;
import com.alexvw.template.repository.UserTagPostRepository;

@RestController
@Component("postService")
@Transactional
class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository postRepository;
	@Autowired
	private TagRepository tagRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserTagPostRepository utpRepository;
	@Autowired
	private ContentTypeRepository ctRepository;

	@Override
	public Page<PostSummary> getAll(Pageable pageable) {
		//create blank list of display objects
		List<PostSummary> summaryList = new ArrayList<PostSummary>();
		Page <Post> allPosts = postRepository.findAll(pageable);
		
		List<Post> postList = (List<Post>) postRepository.findAll();

		for (Post p : allPosts){
			PostSummary newSummary = new PostSummary(p.getId(), p.getContentValue(),p.getDateCreated());
			//List<UserTagPost> tagsForThisPost = utpRepository.findByPost(p.getId());
			//System.out.println(tagsForThisPost);
			//newSummary.setPostTags(tagsForThisPost);
			User whoMadeThisPost = userRepository.findOne(p.getUser().getId());
			newSummary.setPostUserCredential(whoMadeThisPost.getCredential());
			ContentType typeOfThisPost = ctRepository.findOne(p.getContentType().getId());
			newSummary.setPostType(typeOfThisPost.getShortName());
			summaryList.add(newSummary);
		}
		
		return new PageImpl<PostSummary>(summaryList, pageable, summaryList.size());
	}
}