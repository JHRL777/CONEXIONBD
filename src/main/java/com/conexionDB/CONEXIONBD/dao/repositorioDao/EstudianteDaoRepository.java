package com.conexionDB.CONEXIONBD.dao.repositorioDao;

import com.conexionDB.CONEXIONBD.entity.Curso;
import com.conexionDB.CONEXIONBD.entity.Estudiante;

import java.util.List;
import java.util.Optional;

public interface EstudianteDaoRepository {

    List<Estudiante> findAll();
    Optional<Estudiante> findById(Long id);

    void save(Estudiante estudiante);
    void deleateById(Long id);


}
