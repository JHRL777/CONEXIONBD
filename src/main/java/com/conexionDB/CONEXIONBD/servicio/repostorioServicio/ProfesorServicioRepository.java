package com.conexionDB.CONEXIONBD.servicio.repostorioServicio;


import com.conexionDB.CONEXIONBD.entity.Profesor;

import java.util.List;
import java.util.Optional;

public interface ProfesorServicioRepository {

    List<Profesor> findAll();
    Optional<Profesor> findById(Long id);

    void save(Profesor profesor);
    void deleateById(Long id);


}
