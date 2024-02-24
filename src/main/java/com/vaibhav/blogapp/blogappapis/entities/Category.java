package com.vaibhav.blogapp.blogappapis.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    @Column(nullable = false)
    private String categoryTitle;
    private String categoryDescription;

    @OneToMany(mappedBy = "postCategory", cascade = CascadeType.ALL)
    private List<Post> posts = new ArrayList<>();
}
