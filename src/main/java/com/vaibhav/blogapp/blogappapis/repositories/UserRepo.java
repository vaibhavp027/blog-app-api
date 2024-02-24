package com.vaibhav.blogapp.blogappapis.repositories;

import com.vaibhav.blogapp.blogappapis.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
