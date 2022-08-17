package com.practica.controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica.entity.Producto;
import com.practica.services.ProductoService;

@RestController
@RequestMapping ("/api/producto/")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@PostMapping
	public Producto guardar (@RequestBody Producto producto){
		return productoService.create(producto);
		
	}
	
	@GetMapping
	private ResponseEntity<List<Producto>> listarProductos (){
		return ResponseEntity.ok(productoService.getAllProductos());
		
	}
	
	@DeleteMapping
	private ResponseEntity<Void> eliminar (@RequestBody Producto producto){
		productoService.delete(producto);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping ("/{idProducto}")
	public ResponseEntity<?> listarProductoporID (@PathVariable(value = "idProducto") Long idProducto){
		Optional<Producto> oProducto = productoService.findById(idProducto);
		if (!oProducto.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(oProducto);
	}
}
