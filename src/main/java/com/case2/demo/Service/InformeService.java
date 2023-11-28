package com.case2.demo.Service;

import java.util.List;

import com.case2.demo.Modelo.Informe;

public interface InformeService {
    List<Informe> obtenerInformesPorVenta(Long ventaId);
    Informe obtenerInformePorId(Long informeId);
    void actualizarInforme(Informe informe);
    void eliminarInforme(Long informeId);
    Informe crearInforme(Informe informe);
}
