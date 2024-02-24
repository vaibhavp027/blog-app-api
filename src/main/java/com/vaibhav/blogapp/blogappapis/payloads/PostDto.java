package com.vaibhav.blogapp.blogappapis.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {
    private Integer postId;
    private String postTitle;
    private String postContent;
    private String postImageName;
    private Date addedOn;
    private UserDto addedBy;
    private CategoryDto postCategory;
    private Set<CommentDto> comments = new HashSet<>();
}
