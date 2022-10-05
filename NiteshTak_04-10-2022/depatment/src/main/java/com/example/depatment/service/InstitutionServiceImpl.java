package com.example.depatment.service;

import com.example.depatment.bean.Institution;
import com.example.depatment.dto.InstitutionDto;
import com.example.depatment.repo.InstituateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstitutionServiceImpl implements IInstitutionService{

    @Autowired
    InstituateDao instituateDao;

    @Override
    public Institution addInstitution(InstitutionDto institutionDto) {
        Institution institution1 = new Institution();

        institution1.setInstName(institutionDto.getInstName());
        institution1.setInstId(institutionDto.getInstId());
        institution1.setInstAddress(institutionDto.getInstAddress());
        institution1.setInstCode(institutionDto.getInstCode());


        return instituateDao.save(institution1);
    }

    @Override
    public Institution getInstById(Long id) {
        return instituateDao.findById(id).get();
    }
}
