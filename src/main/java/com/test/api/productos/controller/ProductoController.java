package com.test.api.productos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.api.productos.model.Producto;
import com.test.api.productos.service.ProductoService;

@RestController
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	
	@GetMapping("listarProductos")
	public List<Producto> listarProductos(){
		return null;
		
	}
	
    public Producto getProductoById(Long Id){
		return null;
		
	}

}
