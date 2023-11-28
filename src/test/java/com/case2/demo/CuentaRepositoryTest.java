package com.case2.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.case2.demo.Modelo.Cuenta;
import com.case2.demo.Repository.CuentaRepository;

@DataJpaTest
public class CuentaRepositoryTest {

    @Autowired
    private CuentaRepository cuentaRepository;

    @Test
    public void testGuardarCuentaEnRepositorio() {
        // Crear una cuenta para la prueba
        Cuenta cuenta = new Cuenta();
        cuenta.setNombre("NombrePrueba");
        cuenta.setDescripcion("DescripciónPrueba");
        cuenta.setTipo("TipoPrueba");
        cuenta.setDireccion("DireccionPrueba");
        cuenta.setIndustria("IndustriaPrueba");

        // Guardar la cuenta en el repositorio
        Cuenta savedCuenta = cuentaRepository.save(cuenta);

        // Obtener la cuenta del repositorio por ID
        Long cuentaId = savedCuenta.getId();
        Cuenta retrievedCuenta = cuentaRepository.findById(cuentaId).orElse(null);

       
    }
}
