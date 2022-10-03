package com.star.springbootrestapi.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity                                    //Default(class) name table will be created
@Table(name = "BookDetails")             //BookDetails table will be created
public class Books {

    @Id                                   //now bid will be considered as primary key in database
    private int bid;
    @Column
    private String bname;
    @Column
    private String btype;
    @Column
    private int bprice;
}
