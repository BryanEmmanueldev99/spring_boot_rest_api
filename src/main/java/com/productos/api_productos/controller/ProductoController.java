package com.productos.api_productos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productos.api_productos.model.Producto;
import com.productos.api_productos.services.impl.ProductoServiceImpl;

@RestController
@RequestMapping(value = "api/v1/")
public class ProductoController {

     @Autowired
     private ProductoServiceImpl productoServiceImpl;

     @GetMapping("productos")
     public List<Producto> index()
     {
            return this.productoServiceImpl.getProductos();
     }

     @GetMapping("producto/{id}")
     public Optional<Producto> show(@PathVariable Long id)
     {
            return this.productoServiceImpl.getPorducto(id);
     }

     @PostMapping("producto")
     public void store(@RequestBody Producto producto)
     {
           this.productoServiceImpl.addProducto(producto);
     }

     @PutMapping("producto/{id}")
     public void update(@RequestBody Producto producto, @PathVariable Long id)
     {
           this.productoServiceImpl.updateProductoEntity(producto, id);
     }

     @DeleteMapping("producto/{id}")
     public void destroy(@PathVariable Long id)
     {
           this.productoServiceImpl.deleteProducto(id);
     }
}
