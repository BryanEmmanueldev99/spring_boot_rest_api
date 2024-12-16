package com.productos.api_productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productos.api_productos.model.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Long> {

}
