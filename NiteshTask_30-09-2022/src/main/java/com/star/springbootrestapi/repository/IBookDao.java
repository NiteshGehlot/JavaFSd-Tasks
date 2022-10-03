package com.star.springbootrestapi.repository;

import com.star.springbootrestapi.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookDao extends JpaRepository<Books,Integer> {
}
