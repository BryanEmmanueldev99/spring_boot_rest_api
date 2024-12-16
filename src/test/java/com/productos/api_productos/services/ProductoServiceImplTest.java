package com.productos.api_productos.services;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.productos.api_productos.model.Producto;
import com.productos.api_productos.repository.IProductoRepository;
import com.productos.api_productos.services.impl.ProductoServiceImpl;

public class ProductoServiceImplTest {

    @Mock
    private IProductoRepository iProductoRepository;

    @InjectMocks
    private ProductoServiceImpl productoServiceImpl;

    private Producto producto;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        producto = new Producto();
        producto.setId(new Long(11));
        producto.setNombre("Test producto");
        producto.setPrecio(40);
        producto.setSku("111");
        producto.getFoto();
    }

    @Test
    void findAll()
    {
       when(iProductoRepository.findAll()).thenReturn(Arrays.asList(producto));
       assertNotNull(productoServiceImpl.getProductos());
    }
}
