package com.conexionDB.CONEXIONBD.servicio.impl;

import com.conexionDB.CONEXIONBD.dao.repositorioDao.CursoDaoRepository;
import com.conexionDB.CONEXIONBD.entity.Curso;
import com.conexionDB.CONEXIONBD.servicio.repostorioServicio.CursoServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoServicioImpl implements CursoServicioRepository {

    @Autowired
    private CursoDaoRepository cursoDaoRepository;

    @Override
    public List<Curso> findAll() {
        return cursoDaoRepository.findAll();
    }

    @Override
    public Optional<Curso> findById(Long id) {
        return cursoDaoRepository.findById(id);
    }

    @Override
    public void save(Curso curso) {
        cursoDaoRepository.save(curso);
    }

    @Override
    public void deleateById(Long id) {
            cursoDaoRepository.deleateById(id);
    }
}
