package com.example.usermicroservices.vo;

import com.example.usermicroservices.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInstitutionVO {

    private User user;
    private Institution institution;
}
