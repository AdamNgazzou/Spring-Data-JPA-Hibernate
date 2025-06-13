package com.adam.jpa.repositories;


import com.adam.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository <Author, Integer> {



}
