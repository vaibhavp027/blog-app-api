package com.vaibhav.blogapp.blogappapis.services.impl;

import com.vaibhav.blogapp.blogappapis.entities.Comment;
import com.vaibhav.blogapp.blogappapis.entities.Post;
import com.vaibhav.blogapp.blogappapis.exceptions.ResourceNotFoundException;
import com.vaibhav.blogapp.blogappapis.payloads.CommentDto;
import com.vaibhav.blogapp.blogappapis.repositories.CommentRepo;
import com.vaibhav.blogapp.blogappapis.repositories.PostRepo;
import com.vaibhav.blogapp.blogappapis.services.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private PostRepo postRepo;

    @Autowired
    private CommentRepo commentRepo;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public CommentDto createComment(CommentDto commentDto, Integer postId) {
        Post post = postRepo.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post", "PostId", postId));
        Comment comment = modelMapper.map(commentDto, Comment.class);
        comment.setPost(post);
        Comment savedComment = commentRepo.save(comment);
        return modelMapper.map(savedComment, CommentDto.class);
    }

    @Override
    public void deleteComment(Integer commentId) {
        Comment comment = commentRepo.findById(commentId).orElseThrow(() -> new ResourceNotFoundException("Comment", "CommentId", commentId));
        commentRepo.delete(comment);
    }
}
