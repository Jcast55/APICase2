package com.case2.demo.Service;
import java.util.List;

import com.case2.demo.Modelo.Cuenta;
import com.case2.demo.Modelo.Venta;


public interface CuentaService {
    List<Cuenta> obtenerTodasLasCuentas();
    List<Venta> obtenerVentasPorCuenta(Long cuentaId);
    Cuenta obtenerCuentaPorId(Long cuentaId);
    void actualizarCuenta(Cuenta cuenta);
    void eliminarCuenta(Long cuentaId);
    Cuenta crearCuenta(Cuenta cuenta);
}
