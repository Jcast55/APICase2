package com.case2.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.case2.demo.Modelo.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Long> {
    // Puedes agregar métodos personalizados según tus necesidades
}