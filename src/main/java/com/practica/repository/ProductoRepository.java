package com.practica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.practica.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
