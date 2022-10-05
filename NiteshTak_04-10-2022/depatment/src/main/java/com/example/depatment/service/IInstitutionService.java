package com.example.depatment.service;

import com.example.depatment.bean.Institution;
import com.example.depatment.dto.InstitutionDto;

public interface IInstitutionService {

    public Institution addInstitution(InstitutionDto institutionDto);
    public Institution getInstById(Long id);
}
