package com.example.usermicroservices.controller;

import com.example.usermicroservices.entity.User;
import com.example.usermicroservices.service.IUserService;
import com.example.usermicroservices.vo.UserInstitutionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {

    @Autowired
    IUserService iUserService;

    @PostMapping("/add")
    public User addUSer(@RequestBody User user){
        return iUserService.addUSer(user);
    }

    @GetMapping("/get/{id}")
    public User findById(@PathVariable("id") Long userId){
        return iUserService.findById(userId);
    }

    @GetMapping("/get/user-inst/{id}")
    public UserInstitutionVO getUserWithDept(@PathVariable("id") Long userId){
        return iUserService.getUserWithDept(userId);
    }
}
