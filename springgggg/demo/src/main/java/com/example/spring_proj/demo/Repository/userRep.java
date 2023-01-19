package com.example.spring_proj.demo.Repository;

import com.example.spring_proj.demo.User1;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRep extends JpaRepository<User1,Integer> {

}
