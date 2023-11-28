package com.case2.demo.Modelo;


import java.util.List;

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
    @OneToMany(mappedBy = "cuenta", cascade = CascadeType.ALL)
    private List<Contacto> contactos;

    @OneToMany(mappedBy = "cuenta", cascade = CascadeType.ALL)
    private List<Venta> oportunidades;

}
