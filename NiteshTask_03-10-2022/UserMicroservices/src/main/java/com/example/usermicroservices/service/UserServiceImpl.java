package com.example.usermicroservices.service;

import com.example.usermicroservices.entity.User;
import com.example.usermicroservices.repo.IUserDao;
import com.example.usermicroservices.vo.Institution;
import com.example.usermicroservices.vo.UserInstitutionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    IUserDao iUserDao;

    @Override
    public User addUSer(User user) {
        return iUserDao.save(user);
    }

    @Override
    public User findById(Long userId) {
        return iUserDao.findById(userId).get();
    }

    @Override
    public UserInstitutionVO getUserWithDept(Long userId) {
        User user = findById(userId);
        Long instId = user.getInstId();

       Institution institution = restTemplate.getForObject("http://localhost:8080/api/v1/get/"+instId, Institution.class);

       // Institution institution = (Institution) responseEntity.getBody();

        UserInstitutionVO userInstitutionVO = new UserInstitutionVO(user,institution);

        return userInstitutionVO;
    }


}
