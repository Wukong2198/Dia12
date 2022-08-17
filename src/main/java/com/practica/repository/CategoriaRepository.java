package com.practica.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.practica.entity.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria, Long> {

}
