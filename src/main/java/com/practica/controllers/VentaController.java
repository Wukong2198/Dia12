package com.practica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica.entity.Producto;
import com.practica.feignclients.VentaFeignClient;



@RestController
@RequestMapping ("/venta")
public class VentaController {
	
	@Autowired
	private VentaFeignClient ventaFeignClient;


	@GetMapping("/listarTodos-all")
	private ResponseEntity<List<Producto>> listarProductos (){
		return ResponseEntity.ok(ventaFeignClient.getProductos());
		
	}
}
