package com.case2.demo;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@RunWith(SpringRunner.class)

@SpringBootTest
@AutoConfigureMockMvc
public class CuentaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCreateCuenta() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/api/cuentas/create")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("nombre", "NombrePrueba")
                .param("descripcion", "DescripciónPrueba")
                .param("tipo", "TipoPrueba")
                .param("direccion", "DireccionPrueba")
                .param("industria", "IndustriaPrueba"))
                .andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.jsonPath("$.nombre").value("NombrePrueba"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.descripcion").value("DescripciónPrueba"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.tipo").value("TipoPrueba"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.direccion").value("DireccionPrueba"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.industria").value("IndustriaPrueba"));
    }
}
