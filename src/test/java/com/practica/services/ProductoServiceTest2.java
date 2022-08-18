package com.practica.services;

import com.practica.entity.Producto;
import com.practica.repository.ProductoRepository;
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
class ProductoServiceTest2 {
    @Mock
    private Producto producto;

    @Mock
    private ProductoRepository productoRepository;

    @InjectMocks
    private ProductoService productoService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(producto);
        producto = new Producto();
        producto.setIdProducto((long) 6);
        producto.setNombreProducto("Bonafont");
        producto.setDescripcion("Agua Natural Bonafont 2L");
        producto.setIdCategoria(3);
        producto.setNumeroExistencia(100);
        producto.setPrecioUnitario(16.00);
    }

    @Test
    void findAllProductos() {
        when(productoRepository.findAllProductos()).thenReturn(Arrays.asList(producto));
        assertNotNull(productoService.findAllProductos());
    }
    @Test
    void findById(){
        producto = new Producto();
        producto.setIdProducto((long) 6);
        producto.setNombreProducto("Bonafont");
        producto.setDescripcion("Agua Natural Bonafont 2L");
        producto.setIdCategoria(3);
        producto.setNumeroExistencia(100);
        producto.setPrecioUnitario(16.00);

        assertNotNull(productoService.findById((long)6));
    }

    @Test
    void create(){
        producto = new Producto();
        producto.setIdProducto((long) 6);
        producto.setNombreProducto("Bonafont");
        producto.setDescripcion("Agua Natural Bonafont 2L");
        producto.setIdCategoria(3);
        producto.setNumeroExistencia(100);
        producto.setPrecioUnitario(16.00);

        when(productoRepository.save(any(Producto.class))).thenReturn(producto);
        assertNotNull(productoService.create(new Producto()));
    }
}