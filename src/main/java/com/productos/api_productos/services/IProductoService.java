package com.productos.api_productos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.productos.api_productos.model.Producto;

public interface IProductoService {

      public List<Producto> getProductos();
      public Optional<Producto> getPorducto(Long id);
      public String addProducto(Producto producto);
      public ResponseEntity<Producto> updateProductoEntity(Producto producto, Long id);
      public ResponseEntity<Producto> deleteProducto(Long id);

}
