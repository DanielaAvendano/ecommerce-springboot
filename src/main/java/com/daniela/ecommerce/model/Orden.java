package com.daniela.ecommerce.model;

import java.util.Date;
import lombok.Data;

/**
 *
 * @author Daniela Avendano
 */
@Data
public class Orden {

    private Integer id;
    private String numero;
    private Date fechaCreacion;
    private Date fechaRecibida;

    private double total;
}
