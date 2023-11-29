package com.case2.demo.Modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Data
@Entity
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String idVenta1;
    private Double monto;
    private String fechaCierre;
    private String etapa;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "cuenta_id")
    private Cuenta cuenta;

    @OneToMany(mappedBy = "venta")
    @JsonManagedReference
    private List<Informe> informes;
}
