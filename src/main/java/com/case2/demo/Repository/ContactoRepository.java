package com.case2.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.case2.demo.Modelo.Contacto;
import com.case2.demo.Modelo.Cuenta;

public interface ContactoRepository extends JpaRepository<Contacto, Long> {
        List<Contacto> findByCuenta(Cuenta cuenta);
}