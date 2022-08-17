package com.practica.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.practica.entity.Producto;
import com.practica.repository.ProductoRepository;

@Service

public class ProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	
	
	
	public Producto create (Producto producto) {
		return productoRepository.save(producto);
	}
	
	public List<Producto> getAllProductos(){
		return productoRepository.findAll();
	}
	
	public void delete (Producto producto) {
		productoRepository.delete(producto);
	}
	
	public Optional<Producto> findById (Long idProducto) {
		return productoRepository.findById(idProducto);
	}
}
