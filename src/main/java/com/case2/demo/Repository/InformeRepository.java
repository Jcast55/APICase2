package com.case2.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.case2.demo.Modelo.Informe;
import com.case2.demo.Modelo.Venta;

import java.util.List;

public interface InformeRepository extends JpaRepository<Informe, Long> {
    List<Informe> findAllByVenta(Venta venta);
}
