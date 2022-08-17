package com.practica.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.entity.Categoria;
import com.practica.repository.CategoriaRepository;

@Service
public class CategoriaService {


	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria create (Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	
	public List<Categoria> getAllCategorias(){
		return categoriaRepository.findAll();
	}
	
	public void delete (Categoria categoria) {
		categoriaRepository.delete(categoria);
	}
	
	public Optional<Categoria> findById (Long idCategoria) {
		return categoriaRepository.findById(idCategoria);
	}
}
