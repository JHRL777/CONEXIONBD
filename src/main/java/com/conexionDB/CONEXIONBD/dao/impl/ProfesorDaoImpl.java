package com.conexionDB.CONEXIONBD.dao.impl;

import com.conexionDB.CONEXIONBD.dao.repositorioDao.ProfesorDaoRepository;
import com.conexionDB.CONEXIONBD.entity.Profesor;
import com.conexionDB.CONEXIONBD.repositorio.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class ProfesorDaoImpl implements ProfesorDaoRepository {

    @Autowired
    ProfesorRepository profesorRepository;

    @Override
    public List<Profesor> findAll() {
        return profesorRepository.findAll();
    }

    @Override
    public Optional<Profesor> findById(Long id) {
        return profesorRepository.findById(id);
    }

    @Override
    public void save(Profesor profesor) {
            profesorRepository.save(profesor);
    }

    @Override
    public void deleateById(Long id) {
            profesorRepository.deleteById(id);
    }
}
