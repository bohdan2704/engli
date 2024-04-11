package com.example.engli.model;

import com.example.engli.info.StaticValues;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.util.List;

@Entity
@Table(name="users")
public class User extends BaseEntity  {
    @NotBlank
    private String name;
    @NotBlank
    @Pattern(regexp = StaticValues.EMAIL_PATTERN) // message = "{invalid.email}")
    private String email;
    @Pattern(regexp = StaticValues.PASSWORD_PATTERN) // message = "{invalid.email}")
    private String password;
    @ManyToOne
    private Level level;
    @ManyToMany
    private List<Word> savedWords;
    @ManyToMany
    private List<Word> watchedVideos;
}
