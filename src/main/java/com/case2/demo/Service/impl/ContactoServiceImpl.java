package com.case2.demo.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.case2.demo.Modelo.Contacto;
import com.case2.demo.Modelo.Cuenta;
import com.case2.demo.Repository.ContactoRepository;
import com.case2.demo.Repository.CuentaRepository;
import com.case2.demo.Service.ContactoService;

@Service
public class ContactoServiceImpl implements ContactoService {

    @Autowired
    private ContactoRepository contactoRepository;

    @Autowired
    private CuentaRepository cuentaRepository;

    @Override
    public List<Contacto> obtenerContactos() {
        return contactoRepository.findAll();
    }

    @Override
    public Contacto obtenerContactoPorId(Long contactoId) {
        return contactoRepository.findById(contactoId).orElse(null);
    }

    @Override
    public void actualizarContacto(Contacto contacto) {
        contactoRepository.save(contacto);
    }

    @Override
    public void eliminarContacto(Long contactoId) {
        contactoRepository.deleteById(contactoId);
    }

    @Override
    public Contacto crearContacto(Contacto contacto) {
        return contactoRepository.save(contacto);
    }

    @Override
    public List<Contacto> obtenerContactosPorCuenta(Long cuentaId) {
        Cuenta cuenta = cuentaRepository.findById(cuentaId).orElse(null);
        return (cuenta != null) ? contactoRepository.findByCuenta(cuenta) : null;
    }
}
