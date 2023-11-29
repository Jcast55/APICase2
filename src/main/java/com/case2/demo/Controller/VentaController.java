package com.case2.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.case2.demo.Modelo.Cuenta;
import com.case2.demo.Modelo.Venta;
import com.case2.demo.Service.CuentaService;
import com.case2.demo.Service.VentaService;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {

    
    @Autowired
    private VentaService ventaService;

    @Autowired
    private CuentaService cuentaService;

    @GetMapping("/{id}")
    public ResponseEntity<Venta> obtenerVentaId(@PathVariable Long id) {
        Venta venta = ventaService.obtenerVentaPorId(id);

        if (venta != null) {
            // Cargar explícitamente la colección de informes
            venta.getInformes().size();

            return new ResponseEntity<>(venta, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(path = "/create", consumes = "application/x-www-form-urlencoded;charset=UTF-8")
    public ResponseEntity<Venta> createVenta(
            @RequestParam("idVenta1") String idVenta1,
            @RequestParam("monto") Double monto,
            @RequestParam("fechaCierre") String fechaCierre,
            @RequestParam("etapa") String etapa,
            @RequestParam("cuenta_id") Long cuentaId
    ) {
        Venta venta = new Venta();
        venta.setIdVenta1(idVenta1);
        venta.setMonto(monto);
        venta.setFechaCierre(fechaCierre);
        venta.setEtapa(etapa);

        // Aquí obtienes la cuenta correspondiente por su ID
        Cuenta cuenta = cuentaService.obtenerCuentaPorId(cuentaId);
        venta.setCuenta(cuenta);

        Venta createdVenta = ventaService.crearVenta(venta);

        return new ResponseEntity<>(createdVenta, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/update/{id}", consumes = "application/x-www-form-urlencoded;charset=UTF-8")
    public ResponseEntity<Venta> actualizarVenta(
            @PathVariable Long id,
            @RequestParam("idVenta1") String idVenta1,
            @RequestParam("monto") Double monto,
            @RequestParam("fechaCierre") String fechaCierre,
            @RequestParam("etapa") String etapa,
            @RequestParam("cuenta_id") Long cuentaId
    ) {
        Venta ventaExistente = ventaService.obtenerVentaPorId(id);

        if (ventaExistente != null) {
            ventaExistente.setIdVenta1(idVenta1);
            ventaExistente.setMonto(monto);
            ventaExistente.setFechaCierre(fechaCierre);
            ventaExistente.setEtapa(etapa);

            // Aquí obtienes la cuenta correspondiente por su ID
            Cuenta cuenta = cuentaService.obtenerCuentaPorId(cuentaId);
            ventaExistente.setCuenta(cuenta);

            ventaService.actualizarVenta(ventaExistente);

            return new ResponseEntity<>(ventaExistente, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarVenta(@PathVariable Long id) {
        ventaService.eliminarVenta(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<List<Venta>> obtenerTodasLasVentas() {
        List<Venta> ventas = ventaService.obtenerTodasLasVentas();
        return new ResponseEntity<>(ventas, HttpStatus.OK);
    }

  
}

