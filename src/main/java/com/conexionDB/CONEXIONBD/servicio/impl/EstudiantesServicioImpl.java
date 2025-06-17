package com.conexionDB.CONEXIONBD.servicio.impl;

import com.conexionDB.CONEXIONBD.dao.repositorioDao.EstudianteDaoRepository;
import com.conexionDB.CONEXIONBD.entity.Estudiante;
import com.conexionDB.CONEXIONBD.repositorio.InscripcionRepositorio;
import com.conexionDB.CONEXIONBD.servicio.repostorioServicio.EstudianteServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EstudiantesServicioImpl implements EstudianteServicioRepository {

    @Autowired
    private EstudianteDaoRepository estudianteDaoRepository;

    @Autowired
    private InscripcionRepositorio inscripcionRepositorio;


    @Override
    public List<Estudiante> findAll() {

       return estudianteDaoRepository.findAll();

    }

    @Override
    public Optional<Estudiante> findById(Long id) {
        return estudianteDaoRepository.findById(id);
    }

    @Override
    public void save(Estudiante estudiante) {
      estudianteDaoRepository.save(estudiante);
    }

    @Override
    @Transactional
    public void deleateById(Long id) {
        inscripcionRepositorio.deleteByEstudianteId(id);
        estudianteDaoRepository.deleateById(id);
    }
}
