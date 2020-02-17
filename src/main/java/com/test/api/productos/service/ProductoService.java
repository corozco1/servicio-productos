package com.test.api.productos.service;

import java.util.List;
import java.util.Optional;

import com.test.api.productos.model.Producto;

public interface ProductoService {
	
	public List<Producto> findAll();
	public Producto findProducto(Long id);

}
