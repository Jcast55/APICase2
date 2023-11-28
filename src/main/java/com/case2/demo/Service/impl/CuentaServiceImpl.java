package com.case2.demo.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.case2.demo.Modelo.Contacto;
import com.case2.demo.Modelo.Cuenta;
import com.case2.demo.Modelo.Venta;
import com.case2.demo.Repository.CuentaRepository;
import com.case2.demo.Repository.VentaRepository;
import com.case2.demo.Service.CuentaService;

import java.util.List;

@Service
public class CuentaServiceImpl  implements CuentaService {

    @Autowired
    private CuentaRepository cuentaRepository;

    @Autowired
    private VentaRepository ventaRepository;

    @Override
    public List<Venta> obtenerVentasPorCuenta(Long cuentaId) {
        Cuenta cuenta = cuentaRepository.findById(cuentaId).orElse(null);
        if (cuenta != null) {
            return ventaRepository.findAllByCuenta(cuenta);
        }
        return null;
    }

    @Override
    public Cuenta obtenerCuentaPorId(Long cuentaId) {
        return cuentaRepository.findById(cuentaId).orElse(null);
    }

    @Override
    public void actualizarCuenta(Cuenta cuenta) {
        cuentaRepository.save(cuenta);
    }

    @Override
    public void eliminarCuenta(Long cuentaId) {
        cuentaRepository.deleteById(cuentaId);
    }

    @Override
    public Cuenta crearCuenta(Cuenta cuenta) {
        return cuentaRepository.save(cuenta);
    }
    @Override
    public List<Cuenta> obtenerTodasLasCuentas() {
        return cuentaRepository.findAll();
    }
}
