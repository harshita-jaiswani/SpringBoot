package com.example.spring_proj.demo;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


@Entity
    @Data
    @NoArgsConstructor
    public class User1 {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int Id;
        private String f_name;
    private String m_name;
    private String l_name;
    private String password;
    private String email;
    private String phone;
    private String cn;
    private String ou;
    private LocalDateTime created_at;
    private String created_by;
    private LocalDateTime modified_at;
    private String modified_by;

    @ManyToMany
    @JoinTable(name="UserRole",joinColumns=@JoinColumn(name="user_id"),inverseJoinColumns = @JoinColumn(name="role_id"))
    private Set<Role1> assignedRoles=new HashSet<>();

    }
