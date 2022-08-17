package com.practica.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practica.entity.Producto;

@FeignClient (value = "producto-service", url = "http://localhost:8080/api/producto")

public interface VentaFeignClient {

	@GetMapping (value = "/listarTodos", consumes = MediaType.APPLICATION_JSON_VALUE)
	List<Producto> getProductos();
	
	
}
