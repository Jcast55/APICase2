package com.case2.demo.Service;

import java.util.List;

import com.case2.demo.Modelo.Contacto;

public interface ContactoService {
    List<Contacto> obtenerContactos();
    Contacto obtenerContactoPorId(Long contactoId);
    void actualizarContacto(Contacto contacto);
    void eliminarContacto(Long contactoId);
    Contacto crearContacto(Contacto contacto);
    List<Contacto> obtenerContactosPorCuenta(Long cuentaId);
}
