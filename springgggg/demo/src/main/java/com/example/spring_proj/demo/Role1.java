package com.example.spring_proj.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Role1 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int roleId;
    private String roleDiscription;
    private LocalDateTime created_at;
    private String created_by;
    private LocalDateTime modified_at;
    private String modified_by;
    @JsonIgnore
    @ManyToMany
    private Set<User1> assignedRoles = new HashSet<>();

}
