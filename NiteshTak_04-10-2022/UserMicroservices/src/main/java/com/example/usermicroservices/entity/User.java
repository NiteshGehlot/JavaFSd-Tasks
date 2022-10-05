package com.example.usermicroservices.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@ToString
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String userName;
    private String email;
    private Long instId;
	public User(String userName, String email, Long instId) {
		super();
		this.userName = userName;
		this.email = email;
		this.instId = instId;
	}
    
}
