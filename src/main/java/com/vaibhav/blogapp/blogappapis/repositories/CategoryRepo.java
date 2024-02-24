package com.vaibhav.blogapp.blogappapis.repositories;

import com.vaibhav.blogapp.blogappapis.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
