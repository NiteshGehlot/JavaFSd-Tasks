package com.example.depatment.service;

import com.example.depatment.bean.Institution;
import com.example.depatment.repo.InstituateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstitutionServiceImpl implements IInstitutionService{

    @Autowired
    InstituateDao instituateDao;

    @Override
    public Institution addInstitution(Institution institution) {
        return instituateDao.save(institution);
    }

    @Override
    public Institution getInstById(Long id) {
        return instituateDao.findById(id).get();
    }
}
