package com.case2.demo.Controller;

import com.case2.demo.Modelo.Informe;
import com.case2.demo.Modelo.Venta;
import com.case2.demo.Service.InformeService;
import com.case2.demo.Service.VentaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/informes")
public class InformeController {

    @Autowired
    private InformeService informeService;
    @Autowired
    private VentaService ventaService;

    @GetMapping
    public ResponseEntity<List<Informe>> obtenerTodosLosInformes() {
        List<Informe> informes = informeService.obtenerTodosInformes();
        return new ResponseEntity<>(informes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Informe> obtenerInformePorId(@PathVariable Long id) {
        Informe informe = informeService.obtenerInformePorId(id);

        if (informe != null) {
            return new ResponseEntity<>(informe, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(path = "/create", consumes = "application/x-www-form-urlencoded;charset=UTF-8")
    public ResponseEntity<Informe> createInforme(
            @RequestParam("idInforme1") String idInforme1,
            @RequestParam("fecha") String fecha,
            @RequestParam("tipo") String tipo,
            @RequestParam("detalles") String detalles,
            @RequestParam("producto") String producto,
            @RequestParam("bodegaSalida") String bodegaSalida,
            @RequestParam("fechaSalida") String fechaSalida,
            @RequestParam("fechaVencimiento") String fechaVencimiento,
            @RequestParam("venta_id") Long ventaId) {

        Informe informe = new Informe();
        informe.setIdInforme1(idInforme1);
        informe.setFecha(fecha);
        informe.setTipo(tipo);
        informe.setDetalles(detalles);
        informe.setProducto(producto);
        informe.setBodegaSalida(bodegaSalida);
        informe.setFechaSalida(fechaSalida);
        informe.setFechaVencimiento(fechaVencimiento);

        // Aquí obtienes la venta correspondiente por su ID
        Venta venta = ventaService.obtenerVentaPorId(ventaId);
        informe.setVenta(venta);

        Informe createdInforme = informeService.crearInforme(informe);

        return new ResponseEntity<>(createdInforme, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/update/{id}", consumes = "application/x-www-form-urlencoded;charset=UTF-8")
    public ResponseEntity<Informe> actualizarInforme(
            @PathVariable Long id,
            @RequestParam("idInforme1") String idInforme1,
            @RequestParam("fecha") String fecha,
            @RequestParam("tipo") String tipo,
            @RequestParam("detalles") String detalles,
            @RequestParam("producto") String producto,
            @RequestParam("bodegaSalida") String bodegaSalida,
            @RequestParam("fechaSalida") String fechaSalida,
            @RequestParam("fechaVencimiento") String fechaVencimiento,
            @RequestParam("venta_id") Long ventaId) {
        Informe informeExistente = informeService.obtenerInformePorId(id);

        if (informeExistente != null) {
            informeExistente.setIdInforme1(idInforme1);
            informeExistente.setFecha(fecha);
            informeExistente.setTipo(tipo);
            informeExistente.setDetalles(detalles);
            informeExistente.setProducto(producto);
            informeExistente.setBodegaSalida(bodegaSalida);
            informeExistente.setFechaSalida(fechaSalida);
            informeExistente.setFechaVencimiento(fechaVencimiento);

            // Aquí obtienes la venta correspondiente por su ID
            Venta venta = ventaService.obtenerVentaPorId(ventaId);
            informeExistente.setVenta(venta);

            informeService.actualizarInforme(informeExistente);

            return new ResponseEntity<>(informeExistente, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarInforme(@PathVariable Long id) {
        informeService.eliminarInforme(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
