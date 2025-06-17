package com.conexionDB.CONEXIONBD.dao.repositorioDao;

import com.conexionDB.CONEXIONBD.entity.Curso;
import com.conexionDB.CONEXIONBD.entity.Profesor;

import java.util.List;
import java.util.Optional;

public interface ProfesorDaoRepository {

    List<Profesor> findAll();
    Optional<Profesor> findById(Long id);

    void save(Profesor profesor);
    void deleateById(Long id);


}
