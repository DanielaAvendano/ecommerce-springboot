package com.daniela.ecommerce.model;

import lombok.Data;

/**
 *
 * @author Daniela Avendano
 */
@Data
public class Producto {
    private Integer id;
    private String nombre;
    private String descripcion;
    private String imagen;
    private double precio;
    private int cantidad;
            
            
}
