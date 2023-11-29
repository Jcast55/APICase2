package com.case2.demo.Modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Informe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fecha;
    private String tipo;
    private String detalles;
    private String producto;
    private String bodegaSalida;
    private String fechaSalida;
    private String fechaVencimiento;

    @ManyToOne
    @JoinColumn(name = "venta_id")
    @JsonBackReference
    private Venta venta;

}