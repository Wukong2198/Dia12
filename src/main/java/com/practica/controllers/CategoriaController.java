package com.practica.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica.entity.Categoria;
import com.practica.entity.Producto;
import com.practica.services.CategoriaService;

@RestController
@RequestMapping ("/api/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping
	private ResponseEntity<List<Categoria>> listarCategorias (){
		return ResponseEntity.ok(categoriaService.getAllCategorias());
		
	}
	
	@PostMapping
	public Categoria guardar (@RequestBody Categoria categoria){
		return categoriaService.create(categoria);
		
	}
	
	@DeleteMapping
	private ResponseEntity<Void> eliminar (@RequestBody Categoria categoria){
		categoriaService.delete(categoria);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping ("/{idCategoria}")
	public ResponseEntity<?> listarCategoriaID (@PathVariable(value = "idCategoria") Long idCategoria){
		Optional<Categoria> oCategoria = categoriaService.findById(idCategoria);
		if (!oCategoria.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(oCategoria);
	}

}
