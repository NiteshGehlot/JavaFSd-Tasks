package com.example.depatment.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@Data
@NoArgsConstructor
@ToString
@Entity
public class Institution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long instId;
    @Column
    private String instName;
    @Column
    private String instAddress;
    @Column
    private String instCode;
}
