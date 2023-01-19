package com.example.spring_proj.demo.service;

import com.example.spring_proj.demo.Repository.userRep;
import com.example.spring_proj.demo.Repository.roleRep;
import com.example.spring_proj.demo.User1;
import com.example.spring_proj.demo.Role1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserService {
@Autowired
userRep userrep;
@Autowired
roleRep rolerep;
public List<User1>saveUserData(List<User1>userList) {
    return userrep.saveAll(userList);
}

    public List<User1> getUser() {
        return userrep.findAll();
    }

    public User1 assignRoleToUser(int userid, int roleid) {
    Set<Role1> roleSet=null;
    User1 user = userrep.findById(userid).get();
    Role1 role= rolerep.findById(roleid).get();
    roleSet=user.getAssignedRoles();
    roleSet.add(role);
    user.setAssignedRoles(roleSet);
    return userrep.save(user);
    }
}
