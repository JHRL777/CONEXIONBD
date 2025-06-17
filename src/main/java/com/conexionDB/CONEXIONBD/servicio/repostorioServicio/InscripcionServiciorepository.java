package com.conexionDB.CONEXIONBD.servicio.repostorioServicio;

import com.conexionDB.CONEXIONBD.entity.Inscripcion;

import java.util.List;
import java.util.Optional;

public interface InscripcionServiciorepository {

    List<Inscripcion> findAll();
    Optional<Inscripcion> findById(Long id);

    void save(Inscripcion inscripcion);
    void deleateById(Long id);


}
