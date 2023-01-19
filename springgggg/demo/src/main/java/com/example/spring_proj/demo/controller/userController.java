package com.example.spring_proj.demo.controller;

import com.example.spring_proj.demo.User1;
import com.example.spring_proj.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class userController {

@Autowired
    UserService userService;
    @PostMapping("/saveUsers")
    public List<User1> saveUsers(@RequestBody List<User1> userList) {
        return userService.saveUserData(userList);
    }

    @GetMapping("/getUser")
    public List<User1> getUsers() {
        return userService.getUser();
    }

    @PutMapping("/{userid}/role/{roleid}")
    public User1 assignRoleToUser(
            @PathVariable int userid,
            @PathVariable int roleid
    ){
        return userService.assignRoleToUser(userid,roleid);
    }
}