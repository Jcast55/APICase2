package com.case2.demo.Modelo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

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

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "cuenta_id")
    private Cuenta cuenta;

}