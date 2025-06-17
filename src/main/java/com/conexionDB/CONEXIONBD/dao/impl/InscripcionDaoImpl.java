package com.conexionDB.CONEXIONBD.dao.impl;

import com.conexionDB.CONEXIONBD.dao.repositorioDao.InscripcionDaorepository;
import com.conexionDB.CONEXIONBD.entity.Inscripcion;
import com.conexionDB.CONEXIONBD.repositorio.InscripcionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class InscripcionDaoImpl implements InscripcionDaorepository {

    @Autowired
    private InscripcionRepositorio inscripcionRepositorio;
    @Override
    public List<Inscripcion> findAll() {
        return inscripcionRepositorio.findAll();
    }

    @Override
    public Optional<Inscripcion> findById(Long id) {
        return inscripcionRepositorio.findById(id);
    }

    @Override
    public void save(Inscripcion inscripcion) {
            inscripcionRepositorio.save(inscripcion);
    }

    @Override
    public void deleateById(Long id) {
        inscripcionRepositorio.deleteById(id);
    }
}
