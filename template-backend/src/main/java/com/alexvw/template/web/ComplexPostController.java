package com.alexvw.template.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.alexvw.template.domain.PostSummary;
import com.alexvw.template.service.PostService;

@RestController
@RequestMapping("/api/posts")
final class ComplexPostController {
 
    private final PostService postService;
 
    @Autowired
    ComplexPostController(PostService postService) {
        this.postService = postService;
    }
 
    @RequestMapping(value="/getall", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    Page<PostSummary> getAll(Pageable pageable) {
        return (Page<PostSummary>) postService.getAll(pageable);
    }
}