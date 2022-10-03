package com.example.usermicroservices.service;

import com.example.usermicroservices.entity.User;
import com.example.usermicroservices.vo.UserInstitutionVO;

public interface IUserService {

    public User addUSer(User user);
    public User findById(Long userId);

    public UserInstitutionVO getUserWithDept(Long userId);
}
