package com.productos.api_productos.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.productos.api_productos.model.Producto;
import com.productos.api_productos.repository.IProductoRepository;
import com.productos.api_productos.services.IProductoService;


@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private IProductoRepository iProductoRepository;

    @Override
    public List<Producto> getProductos() {
        List<Producto> todosLosProductos = iProductoRepository.findAll();
        return todosLosProductos;
    }

    @Override
    public Optional<Producto> getPorducto(Long id) {
         Optional<Producto> producto = iProductoRepository.findById(id);
         return producto;
    }

    @Override
    public String addProducto(Producto productoEntity) {
          Producto producto = iProductoRepository.save(productoEntity);
          String response = "Producto guardado!";
          return response;
    }

    @Override
    public ResponseEntity<Producto> updateProductoEntity(Producto productoEntity, Long id) {
        Optional<Producto> producto = iProductoRepository.findById(id);

           if(!producto.isPresent()) {
               return ResponseEntity.unprocessableEntity().build();
           }

           productoEntity.setId(producto.get().getId());
           iProductoRepository.save(productoEntity);
           return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<Producto> deleteProducto(Long id) {
        Optional<Producto> producto = iProductoRepository.findById(id);

           if(!producto.isPresent()) {
               return ResponseEntity.unprocessableEntity().build();
           }
           
           iProductoRepository.delete(producto.get());
           return ResponseEntity.noContent().build();
    }

}
