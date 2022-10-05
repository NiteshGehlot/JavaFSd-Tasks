package com.example.usermicroservices.vo;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Institution {             //pojo or bean class it is not an entity class

    private Long instId;
    private String instName;
    private String instAddress;
    private String instCode;
}
