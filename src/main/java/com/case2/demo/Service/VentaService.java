package com.case2.demo.Service;
import java.util.List;

import com.case2.demo.Modelo.Informe;
import com.case2.demo.Modelo.Venta;

public interface VentaService {
    List<Informe> obtenerInformesPorVenta(Long ventaId);
    List<Venta> obtenerTodasLasVentas();
    Venta obtenerVentaPorId(Long ventaId);
    void actualizarVenta(Venta venta);
    void eliminarVenta(Long ventaId);
    Venta crearVenta(Venta venta);
}
