package com.case2.demo.Modelo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Cuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String direccion;
    private String industria;
    private String descripcion;
    private String tipo;

    @JsonManagedReference
    @OneToMany(mappedBy = "cuenta", cascade = CascadeType.ALL)
    private List<Contacto> contactos;

    @JsonManagedReference
    @OneToMany(mappedBy = "cuenta", cascade = CascadeType.ALL)
    private List<Venta> oportunidades;

}
