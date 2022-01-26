
package com.daniela.ecommerce.model;

import lombok.Data;

/**
 *
 * @author Daniela
 */
@Data
public class DetalleOrden {
    private Integer id;
    private String nombre;
    private double cantidad;
    private double precio;
    private double total;
    

            
}
