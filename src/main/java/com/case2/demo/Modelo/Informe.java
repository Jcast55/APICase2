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

    private String idInforme1;
    private String fecha;
    private String tipo;
    private String detalles;
    private String producto;
    private String bodegaSalida;
    private String fechaSalida;
    private String fechaVencimiento;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "venta_id")
    private Venta venta;

    @Override
    public String toString() {
        return "Informe{" +
                "id=" + id +
                ", idInforme1='" + idInforme1 + '\'' +
                ", fecha='" + fecha + '\'' +
                ", tipo='" + tipo + '\'' +
                ", detalles='" + detalles + '\'' +
                ", producto='" + producto + '\'' +
                ", bodegaSalida='" + bodegaSalida + '\'' +
                ", fechaSalida='" + fechaSalida + '\'' +
                ", fechaVencimiento='" + fechaVencimiento + '\'' +
                ", venta=" + (venta != null ? venta.getId() : "null") +
                '}';
    }

}