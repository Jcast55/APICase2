package com.case2.demo.Modelo;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Contacto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correoElectronico;

    @ManyToOne
    @JoinColumn(name = "cuenta_id")
    private Cuenta cuenta;

    @OneToMany(mappedBy = "contacto", cascade = CascadeType.ALL)
    private List<Venta> oportunidades;

}