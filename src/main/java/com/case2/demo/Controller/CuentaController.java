package com.case2.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.case2.demo.Modelo.Cuenta;
import com.case2.demo.Service.CuentaService;

import java.util.List;

@RestController
@RequestMapping("/api/cuentas")
public class CuentaController {

    @Autowired
    private CuentaService cuentaService;

    @GetMapping
    public ResponseEntity<List<Cuenta>> obtenerTodasLasCuentas() {
        List<Cuenta> cuentas = cuentaService.obtenerTodasLasCuentas();
        return new ResponseEntity<>(cuentas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cuenta> obtenerCuentaPorId(@PathVariable Long id) {
        Cuenta cuenta = cuentaService.obtenerCuentaPorId(id);

        if (cuenta != null) {
            // Cargar explícitamente la colección de contactos
            cuenta.getContactos().size();

            return new ResponseEntity<>(cuenta, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(path = "/create", consumes = "application/x-www-form-urlencoded;charset=UTF-8")
    public ResponseEntity<Cuenta> createCuenta(
            @RequestParam("idCuenta1") String idCuenta1,
            @RequestParam("nombre") String nombre,
            @RequestParam("descripcion") String descripcion,
            @RequestParam("tipo") String tipo,
            @RequestParam("direccion") String direccion,
            @RequestParam("industria") String industria
    ) {

        Cuenta cuenta = new Cuenta();
        cuenta.setNombre(nombre);
        cuenta.setDescripcion(descripcion);
        cuenta.setTipo(tipo);
        cuenta.setDireccion(direccion);
        cuenta.setIndustria(industria);
        cuenta.setIdCuenta1(idCuenta1);
        Cuenta createdCuenta = cuentaService.crearCuenta(cuenta);

        return new ResponseEntity<>(createdCuenta, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/update/{id}", consumes = "application/x-www-form-urlencoded;charset=UTF-8")
    public ResponseEntity<Cuenta> actualizarCuenta(
            @PathVariable Long id,
            @RequestParam("idCuenta1") String idCuenta1,
            @RequestParam("nombre") String nombre,
            @RequestParam("descripcion") String descripcion,
            @RequestParam("tipo") String tipo,
            @RequestParam("direccion") String direccion,
            @RequestParam("industria") String industria) {
        Cuenta cuentaExistente = cuentaService.obtenerCuentaPorId(id);

        if (cuentaExistente != null) {
            cuentaExistente.setNombre(nombre);
            cuentaExistente.setDescripcion(descripcion);
            cuentaExistente.setTipo(tipo);
            cuentaExistente.setDireccion(direccion);
            cuentaExistente.setIdCuenta1(idCuenta1);
            cuentaService.actualizarCuenta(cuentaExistente);

            return new ResponseEntity<>(cuentaExistente, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCuenta(@PathVariable Long id) {
        cuentaService.eliminarCuenta(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
