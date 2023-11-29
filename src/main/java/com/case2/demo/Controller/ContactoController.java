package com.case2.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.case2.demo.Service.ContactoService;
import com.case2.demo.Service.CuentaService;
import com.case2.demo.Modelo.Contacto;
import com.case2.demo.Modelo.Cuenta;

@RestController
@RequestMapping("/api/contactos")
public class ContactoController {

    @Autowired
    private ContactoService contactoService;

    @Autowired
    private CuentaService cuentaService;

    @GetMapping
    public ResponseEntity<List<Contacto>> obtenerTodosLosContactos() {
        List<Contacto> contactos = contactoService.obtenerContactos();
        return new ResponseEntity<>(contactos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contacto> obtenerContactoPorId(@PathVariable Long id) {
        Contacto contacto = contactoService.obtenerContactoPorId(id);

        if (contacto != null) {
            return new ResponseEntity<>(contacto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(path = "/create", consumes = "application/x-www-form-urlencoded;charset=UTF-8")
    public ResponseEntity<Contacto> createContacto(
            @RequestParam("idContacto1") String idContacto1,
            @RequestParam("nombre") String nombre,
            @RequestParam("correoElectronico") String correoElectronico,
            @RequestParam("cuenta_id") Long cuentaId
    ) {
        Contacto contacto = new Contacto();
        contacto.setIdContacto1(idContacto1);
        contacto.setNombre(nombre);
        contacto.setCorreoElectronico(correoElectronico);

        // Aquí obtienes la cuenta correspondiente por su ID
        Cuenta cuenta = cuentaService.obtenerCuentaPorId(cuentaId);
        contacto.setCuenta(cuenta);

        Contacto createdContacto = contactoService.crearContacto(contacto);

        return new ResponseEntity<>(createdContacto, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/update/{id}", consumes = "application/x-www-form-urlencoded;charset=UTF-8")
    public ResponseEntity<Contacto> actualizarContacto(
            @PathVariable Long id,
            @RequestParam("idContacto1") String idContacto1,
            @RequestParam("nombre") String nombre,
            @RequestParam("correoElectronico") String correoElectronico,
            @RequestParam("cuenta_id") Long cuentaId
    ) {
        Contacto contactoExistente = contactoService.obtenerContactoPorId(id);

        if (contactoExistente != null) {
            contactoExistente.setIdContacto1(idContacto1);
            contactoExistente.setNombre(nombre);
            contactoExistente.setCorreoElectronico(correoElectronico);

            // Aquí obtienes la cuenta correspondiente por su ID
            Cuenta cuenta = cuentaService.obtenerCuentaPorId(cuentaId);
            contactoExistente.setCuenta(cuenta);

            contactoService.actualizarContacto(contactoExistente);

            return new ResponseEntity<>(contactoExistente, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarContacto(@PathVariable Long id) {
        contactoService.eliminarContacto(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

