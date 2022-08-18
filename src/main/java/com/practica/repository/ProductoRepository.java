package com.practica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.practica.entity.Producto;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

    List<Producto> findAllProductos();
}
