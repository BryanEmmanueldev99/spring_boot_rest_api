package com.productos.api_productos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_productos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Producto {
      public Producto(int i, String string, String string2, int j, String string3) {
        //TODO Auto-generated constructor stub
    }

    @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;

      @Size(max=30, min=3)
      @NotEmpty(message = "nombre es un valor requerido!")
      private String nombre;

      @NotEmpty(message = "sku es un valor requerido!")
      @PositiveOrZero
      private String sku;

      @NotNull(message = "precio es un valor requerido!")
      @PositiveOrZero
      private double precio;

      @Null
      private String foto;
}