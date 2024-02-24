package com.vaibhav.blogapp.blogappapis.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private int id;
    @NotEmpty
    @Size(min = 4, message = "Username must be minimum 4 char long.")
    private String name;
    @Email(message = "Email address is not valid.")
    private String email;
    @NotEmpty
    @Size(min = 8, max = 12, message = "Password must be min of 8 chars and max of 12 chars.")
    private String password;
    @NotNull
    private String about;
}
