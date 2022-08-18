package com.practica.services;

import com.practica.entity.Categoria;
import com.practica.repository.CategoriaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CategoriaServiceTest {

    @Mock
    private Categoria categoria;
    @Mock
    private CategoriaRepository categoriaRepository;

    @InjectMocks
    private CategoriaService categoriaService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(categoria);
        categoria.setIdCategoria((long) 5);
        categoria.setDescripcion("Cereales");

    }

    @Test
    void findAllCategorias() {
        when(categoriaRepository.findAll()).thenReturn(Arrays.asList(categoria));
        assertNotNull(categoriaService.findAllCategorias());
    }

    @Test
    void findById(){
        categoria = new Categoria();
        categoria.setIdCategoria((long) 5);
        categoria.setDescripcion("Cereales");

        assertNotNull(categoriaService.findById((long)5));
    }

    @Test
    void create(){
        categoria = new Categoria();
        categoria.setIdCategoria((long) 5);
        categoria.setDescripcion("Cereales");
        when(categoriaRepository.save(any(Categoria.class))).thenReturn(categoria);
        assertNotNull(categoriaService.save(new Categoria()));
    }
}