package com.vaibhav.blogapp.blogappapis.services;

import com.vaibhav.blogapp.blogappapis.entities.Post;
import com.vaibhav.blogapp.blogappapis.payloads.PostDto;
import com.vaibhav.blogapp.blogappapis.payloads.PostResponse;
import org.apache.coyote.http11.filters.SavedRequestInputFilter;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
    PostDto updatePost(PostDto postDto, Integer postId);
    void deletePost(Integer postId);
    PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);
    PostDto getPostById(Integer postId);
    List<PostDto> getPostByCategory(Integer categoryId);
    List<PostDto> getPostByUser(Integer userId);
    List<PostDto> searchPost(String keyword);
}
