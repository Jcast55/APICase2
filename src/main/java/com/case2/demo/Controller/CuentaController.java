package com.case2.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.case2.demo.Modelo.Contacto;
import com.case2.demo.Modelo.Cuenta;
import com.case2.demo.Modelo.Informe;
import com.case2.demo.Modelo.Venta;
import com.case2.demo.Service.CuentaService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/cuentas")
public class CuentaController {

    @Autowired
    private CuentaService cuentaService;

    @GetMapping
    public ResponseEntity<List<Map<String, Object>>> obtenerTodasLasCuentasConDetalles() {
        List<Cuenta> cuentas = cuentaService.obtenerTodasLasCuentas();

        if (!cuentas.isEmpty()) {
            List<Map<String, Object>> cuentasDTO = new ArrayList<>();
            for (Cuenta cuenta : cuentas) {
                Map<String, Object> cuentaDTO = new HashMap<>();
                cuentaDTO.put("id", cuenta.getId());
                cuentaDTO.put("idCuenta1", cuenta.getIdCuenta1());
                cuentaDTO.put("nombre", cuenta.getNombre());
                cuentaDTO.put("direccion", cuenta.getDireccion());
                cuentaDTO.put("industria", cuenta.getIndustria());
                cuentaDTO.put("descripcion", cuenta.getDescripcion());
                cuentaDTO.put("tipo", cuenta.getTipo());

                // Mapear los contactos
                List<Map<String, Object>> contactosDTO = new ArrayList<>();
                for (Contacto contacto : cuenta.getContactos()) {
                    Map<String, Object> contactoDTO = new HashMap<>();
                    contactoDTO.put("id", contacto.getId());
                    contactoDTO.put("idContacto1", contacto.getIdContacto1());
                    contactoDTO.put("nombre", contacto.getNombre());
                    contactoDTO.put("correoElectronico", contacto.getCorreoElectronico());
                    contactosDTO.add(contactoDTO);
                }
                cuentaDTO.put("contactos", contactosDTO);

                // Mapear las oportunidades con informes
                List<Map<String, Object>> oportunidadesDTO = new ArrayList<>();
                for (Venta venta : cuenta.getOportunidades()) {
                    Map<String, Object> oportunidadDTO = new HashMap<>();
                    oportunidadDTO.put("id", venta.getId());
                    oportunidadDTO.put("idVenta1", venta.getIdVenta1());
                    oportunidadDTO.put("monto", venta.getMonto());
                    oportunidadDTO.put("fechaCierre", venta.getFechaCierre());
                    oportunidadDTO.put("etapa", venta.getEtapa());

                    // Mapear los informes
                    List<Map<String, Object>> informesDTO = new ArrayList<>();
                    for (Informe informe : venta.getInformes()) {
                        Map<String, Object> informeDTO = new HashMap<>();
                        informeDTO.put("id", informe.getId());
                        informeDTO.put("idInforme1", informe.getIdInforme1());
                        informeDTO.put("fecha", informe.getFecha());
                        informeDTO.put("tipo", informe.getTipo());
                        informeDTO.put("detalles", informe.getDetalles());
                        informeDTO.put("producto", informe.getProducto());
                        informeDTO.put("bodegaSalida", informe.getBodegaSalida());
                        informeDTO.put("fechaSalida", informe.getFechaSalida());
                        informeDTO.put("fechaVencimiento", informe.getFechaVencimiento());
                        informeDTO.put("idVenta", venta.getId());
                        informesDTO.add(informeDTO);
                    }
                    oportunidadDTO.put("informes", informesDTO);
                    oportunidadesDTO.add(oportunidadDTO);
                }
                cuentaDTO.put("oportunidades", oportunidadesDTO);

                cuentasDTO.add(cuentaDTO);
            }

            return new ResponseEntity<>(cuentasDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Map<String, Object>> obtenerCuentaConDetalles(@PathVariable Long id) {
        Cuenta cuenta = cuentaService.obtenerCuentaPorId(id);

        if (cuenta != null) {
            Map<String, Object> cuentaDTO = new HashMap<>();
            cuentaDTO.put("id", cuenta.getId());
            cuentaDTO.put("idCuenta1", cuenta.getIdCuenta1());
            cuentaDTO.put("nombre", cuenta.getNombre());
            cuentaDTO.put("direccion", cuenta.getDireccion());
            cuentaDTO.put("industria", cuenta.getIndustria());
            cuentaDTO.put("descripcion", cuenta.getDescripcion());
            cuentaDTO.put("tipo", cuenta.getTipo());

            // Mapear los contactos
            List<Map<String, Object>> contactosDTO = new ArrayList<>();
            for (Contacto contacto : cuenta.getContactos()) {
                Map<String, Object> contactoDTO = new HashMap<>();
                contactoDTO.put("id", contacto.getId());
                contactoDTO.put("idContacto1", contacto.getIdContacto1());
                contactoDTO.put("nombre", contacto.getNombre());
                contactoDTO.put("correoElectronico", contacto.getCorreoElectronico());
                contactosDTO.add(contactoDTO);
            }
            cuentaDTO.put("contactos", contactosDTO);

            // Mapear las oportunidades con informes
            List<Map<String, Object>> oportunidadesDTO = new ArrayList<>();
            for (Venta venta : cuenta.getOportunidades()) {
                Map<String, Object> oportunidadDTO = new HashMap<>();
                oportunidadDTO.put("id", venta.getId());
                oportunidadDTO.put("idVenta1", venta.getIdVenta1());
                oportunidadDTO.put("monto", venta.getMonto());
                oportunidadDTO.put("fechaCierre", venta.getFechaCierre());
                oportunidadDTO.put("etapa", venta.getEtapa());

                // Mapear los informes
                List<Map<String, Object>> informesDTO = new ArrayList<>();
                for (Informe informe : venta.getInformes()) {
                    Map<String, Object> informeDTO = new HashMap<>();
                    informeDTO.put("id", informe.getId());
                    informeDTO.put("idInforme1", informe.getIdInforme1());
                    informeDTO.put("fecha", informe.getFecha());
                    informeDTO.put("tipo", informe.getTipo());
                    informeDTO.put("detalles", informe.getDetalles());
                    informeDTO.put("producto", informe.getProducto());
                    informeDTO.put("bodegaSalida", informe.getBodegaSalida());
                    informeDTO.put("fechaSalida", informe.getFechaSalida());
                    informeDTO.put("fechaVencimiento", informe.getFechaVencimiento());
                    informeDTO.put("idVenta", informe.getVenta().getId());
                    informesDTO.add(informeDTO);
                }
                oportunidadDTO.put("informes", informesDTO);
                oportunidadesDTO.add(oportunidadDTO);
            }
            cuentaDTO.put("oportunidades", oportunidadesDTO);

            return new ResponseEntity<>(cuentaDTO, HttpStatus.OK);
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
            @RequestParam("industria") String industria) {

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
