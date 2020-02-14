package com.test.api.productos.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.test.api.productos.model.Producto;

public interface ProductosRepositoryDAO extends MongoRepository<Producto, Long> {

}
