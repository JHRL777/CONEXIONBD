package com.conexionDB.CONEXIONBD.dao.repositorioDao;

import com.conexionDB.CONEXIONBD.entity.Curso;
import com.conexionDB.CONEXIONBD.entity.Inscripcion;

import java.util.List;
import java.util.Optional;

public interface InscripcionDaorepository {

    List<Inscripcion> findAll();
    Optional<Inscripcion> findById(Long id);

    void save(Inscripcion inscripcion);
    void deleateById(Long id);


}
