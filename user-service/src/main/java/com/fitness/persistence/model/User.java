package com.fitness.persistence.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "user")
@Getter
@Setter
public class User {
    @Id
    private Long id;
    private String name;
    private String email;
    private Integer age;
    private Integer weight;

    @ElementCollection
    private List<Long> programIds = new ArrayList<>();
}
