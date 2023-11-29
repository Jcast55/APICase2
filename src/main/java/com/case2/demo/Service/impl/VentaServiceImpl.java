package com.case2.demo.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.case2.demo.Modelo.Informe;
import com.case2.demo.Modelo.Venta;
import com.case2.demo.Repository.InformeRepository;
import com.case2.demo.Repository.VentaRepository;
import com.case2.demo.Service.VentaService;

import java.util.List;

@Service
public class VentaServiceImpl implements VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    @Autowired
    private InformeRepository informeRepository;

    @Override
    public List<Informe> obtenerInformesPorVenta(Long ventaId) {
        Venta venta = ventaRepository.findById(ventaId).orElse(null);
        return (venta != null) ? informeRepository.findAllByVenta(venta) : null;
    }

    @Override
    public Venta obtenerVentaPorId(Long ventaId) {
        return ventaRepository.findById(ventaId).orElse(null);
    }

    @Override
    public void actualizarVenta(Venta venta) {
        ventaRepository.save(venta);
    }

    @Override
    public void eliminarVenta(Long ventaId) {
        ventaRepository.deleteById(ventaId);
    }

    @Override
    public Venta crearVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    @Override
    public List<Venta> obtenerTodasLasVentas() {
         return ventaRepository.findAll();
    }
}
