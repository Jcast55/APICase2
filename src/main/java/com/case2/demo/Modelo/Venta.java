package com.case2.demo.Modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double monto;
    private String fechaCierre;
    private String etapa;

    @ManyToOne
    @JoinColumn(name = "cuenta_id")
    private Cuenta cuenta;

    @ManyToOne
    @JoinColumn(name = "contacto_id")
    private Contacto contacto;

    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL)
    private List<Informe> informes;
}
