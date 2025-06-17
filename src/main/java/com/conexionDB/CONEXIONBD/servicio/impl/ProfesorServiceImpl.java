package com.conexionDB.CONEXIONBD.servicio.impl;


import com.conexionDB.CONEXIONBD.dao.repositorioDao.ProfesorDaoRepository;
import com.conexionDB.CONEXIONBD.entity.Profesor;
import com.conexionDB.CONEXIONBD.servicio.repostorioServicio.ProfesorServicioRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorServiceImpl implements ProfesorServicioRepository {

    @Autowired
    ProfesorDaoRepository profesorDaoRepository;

    @Override
    public List<Profesor> findAll() {
        return profesorDaoRepository.findAll();
    }

    @Override
    public Optional<Profesor> findById(Long id) {
        return profesorDaoRepository.findById(id);
    }

    @Override
    public void save(Profesor profesor) {
        profesorDaoRepository.save(profesor);
    }

    @Override
    public void deleateById(Long id) {
            profesorDaoRepository.deleateById(id);
    }
}
