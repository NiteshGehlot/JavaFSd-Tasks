package com.example.depatment.service;

import com.example.depatment.bean.Institution;

public interface IInstitutionService {

    public Institution addInstitution(Institution institution);
    public Institution getInstById(Long id);
}
