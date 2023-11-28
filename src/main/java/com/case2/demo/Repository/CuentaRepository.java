package com.case2.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.case2.demo.Modelo.Contacto;
import com.case2.demo.Modelo.Cuenta;
import com.case2.demo.Modelo.Venta;


public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
}
