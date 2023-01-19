package com.example.spring_proj.demo.service;

import com.example.spring_proj.demo.Repository.roleRep;
import com.example.spring_proj.demo.Role1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    roleRep rolerep;
    public List<Role1>saveRoleData(List<Role1>roleList) {
        return rolerep.saveAll(roleList);
    }

    public List<Role1> getRole() {
        return rolerep.findAll();
    }
}
