package com.case2.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.case2.demo.Modelo.Cuenta;
import com.case2.demo.Repository.CuentaRepository;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private CuentaRepository cuentaRepository;
	  
    @Test
    public void testFindById() {
        // Assuming there is an account with ID 1 in your database
        Long accountId = 1L;

        Optional<Cuenta> cuentaOptional = cuentaRepository.findById(accountId);

        assertTrue(cuentaOptional.isPresent(), "Account not found");
        
        Cuenta cuenta = cuentaOptional.get();

        System.out.println(cuenta.toString());
        assertEquals("tecnologica", cuenta.getTipo());
        // Add assertions based on your actual data model
        // For example:
        // assertEquals("ExpectedValue", cuenta.getSomeField());
    }

}
