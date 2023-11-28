package com.case2.demo.Modelo;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
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
    private Venta venta;

}