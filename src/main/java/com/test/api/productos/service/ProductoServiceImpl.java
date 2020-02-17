package com.test.api.productos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.api.productos.model.Producto;
import com.test.api.productos.repository.ProductosRepositoryDAO;


@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductosRepositoryDAO productoDao;
	
	@Override 
	public List<Producto> findAll() {
		return productoDao.findAll();
	}

	@Override
	public Producto findProducto(Long id) {
		return productoDao.findById(id).orElse(null);
	}

}
