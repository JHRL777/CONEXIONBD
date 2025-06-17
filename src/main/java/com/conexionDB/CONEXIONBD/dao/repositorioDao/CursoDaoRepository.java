package com.conexionDB.CONEXIONBD.dao.repositorioDao;

import com.conexionDB.CONEXIONBD.entity.Curso;

import java.util.List;
import java.util.Optional;

public interface CursoDaoRepository {

    List<Curso> findAll();
    Optional<Curso> findById(Long id);

    void save(Curso curso);
    void deleateById(Long id);


}
