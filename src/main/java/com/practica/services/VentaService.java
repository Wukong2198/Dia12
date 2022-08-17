package com.practica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.practica.entity.Producto;
import com.practica.feignclients.VentaFeignClient;

@Service

public class VentaService {
	
	@Autowired
	private final VentaFeignClient venta = null;
	
	public List<Producto> getProductos(){
		return venta.getProductos();
	}
}
