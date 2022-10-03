package com.example.depatment.repo;

import com.example.depatment.bean.Institution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstituateDao extends JpaRepository<Institution,Long> {

}
