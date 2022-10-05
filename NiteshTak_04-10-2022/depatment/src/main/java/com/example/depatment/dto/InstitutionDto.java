package com.example.depatment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class InstitutionDto {
    private Long instId;
    private String instName;
    private String instAddress;
    private String instCode;
}
