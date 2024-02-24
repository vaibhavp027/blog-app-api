package com.vaibhav.blogapp.blogappapis.repositories;

import com.vaibhav.blogapp.blogappapis.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Integer> {
}
