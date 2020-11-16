package com.redsocial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redsocial.entity.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer>{

}
