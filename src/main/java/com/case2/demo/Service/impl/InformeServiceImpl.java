package com.case2.demo.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.case2.demo.Modelo.Informe;
import com.case2.demo.Modelo.Venta;
import com.case2.demo.Repository.InformeRepository;
import com.case2.demo.Repository.VentaRepository;
import com.case2.demo.Service.InformeService;

import java.util.List;

@Service
public class InformeServiceImpl implements InformeService {

    @Autowired
    private InformeRepository informeRepository;
    @Autowired
    private VentaRepository ventaRepository;

    @Override
    public List<Informe> obtenerInformesPorVenta(Long ventaId) {
        Venta venta = ventaRepository.findById(ventaId).orElse(null);
        return (venta != null) ? informeRepository.findAllByVenta(venta) : null;
    }

    @Override
    public Informe obtenerInformePorId(Long informeId) {
        return informeRepository.findById(informeId).orElse(null);
    }

    @Override
    public void actualizarInforme(Informe informe) {
        informeRepository.save(informe);
    }

    @Override
    public void eliminarInforme(Long informeId) {
        informeRepository.deleteById(informeId);
    }

    @Override
    public Informe crearInforme(Informe informe) {
        return informeRepository.save(informe);
    }

    @Override
    public List<Informe> obtenerTodosInformes() {
       return informeRepository.findAll();
    }
}
