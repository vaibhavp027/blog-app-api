package com.vaibhav.blogapp.blogappapis.repositories;

import com.vaibhav.blogapp.blogappapis.entities.Category;
import com.vaibhav.blogapp.blogappapis.entities.Post;
import com.vaibhav.blogapp.blogappapis.entities.User;
import com.vaibhav.blogapp.blogappapis.payloads.PostDto;
import com.vaibhav.blogapp.blogappapis.payloads.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Integer> {
    List<Post> findByAddedBy(User addedBy);
    List<Post> findByPostCategory(Category category);
    List<Post> findByPostTitleContaining(String title);
}
