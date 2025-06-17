package com.conexionDB.CONEXIONBD.servicio.repostorioServicio;

import com.conexionDB.CONEXIONBD.entity.Estudiante;

import java.util.List;
import java.util.Optional;

public interface EstudianteServicioRepository {

    List<Estudiante> findAll();
    Optional<Estudiante> findById(Long id);

    void save(Estudiante estudiante);
    void deleateById(Long id);


}
