package com.example.spring_proj.demo.controller;

import com.example.spring_proj.demo.Role1;
import com.example.spring_proj.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class roleController {

    @Autowired
    RoleService roleService;
    @PostMapping("/saveRoles")
    public List<Role1> saveRoles(@RequestBody List<Role1> roleList) {
        return roleService.saveRoleData(roleList);
    }

    @GetMapping("/getRole")
    public List<Role1> getRoles() {
        return roleService.getRole();
    }
}