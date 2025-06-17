package com.conexionDB.CONEXIONBD.dao.impl;

import com.conexionDB.CONEXIONBD.dao.repositorioDao.CursoDaoRepository;
import com.conexionDB.CONEXIONBD.entity.Curso;
import com.conexionDB.CONEXIONBD.repositorio.CursoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CursoDaoImpl implements CursoDaoRepository {

    @Autowired
    private CursoRepositorio cursoRepositorio;

    @Override
    public List<Curso> findAll() {
        return cursoRepositorio.findAll();
    }

    @Override
    public Optional<Curso> findById(Long id) {
        return cursoRepositorio.findById(id);
    }

    @Override
    public void save(Curso curso) {
        cursoRepositorio.save(curso);
    }

    @Override
    public void deleateById(Long id) {
            cursoRepositorio.deleteById(id);
    }
}
