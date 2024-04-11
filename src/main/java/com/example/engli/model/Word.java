package com.example.engli.model;

import com.example.engli.info.StaticValues;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="words")
public class Word extends BaseEntity {
    private String english;
    private String ukranian;
    @Pattern(regexp = StaticValues.ENGLISH_LEVEL_PATTERN) // message = "{invalid.email}")
    private String level;
}
