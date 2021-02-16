package com.jstvnyk.mygraphql.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jstvnyk.mygraphql.dao.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>{

}
