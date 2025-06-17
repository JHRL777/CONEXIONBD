package com.conexionDB.CONEXIONBD.servicio.repostorioServicio;

import com.conexionDB.CONEXIONBD.entity.Curso;

import java.util.List;
import java.util.Optional;

public interface CursoServicioRepository {

    List<Curso> findAll();
    Optional<Curso> findById(Long id);

    void save(Curso curso);
    void deleateById(Long id);


}
