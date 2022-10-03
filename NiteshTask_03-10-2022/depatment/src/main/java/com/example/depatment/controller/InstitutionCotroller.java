package com.example.depatment.controller;

import com.example.depatment.bean.Institution;
import com.example.depatment.service.IInstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class InstitutionCotroller {

    @Autowired
    IInstitutionService instService;


    @PostMapping("/add")
    public Institution addInstitutuion(@RequestBody Institution institution){
        return instService.addInstitution(institution);
    }

    @GetMapping("/get/{id}")
    public Institution findById(@PathVariable("id") Long id){
        return instService.getInstById(id);
    }


}
