package com.conexionDB.CONEXIONBD.dao.impl;

import com.conexionDB.CONEXIONBD.dao.repositorioDao.EstudianteDaoRepository;
import com.conexionDB.CONEXIONBD.entity.Estudiante;
import com.conexionDB.CONEXIONBD.repositorio.EstudianteRepositorio;
import com.conexionDB.CONEXIONBD.repositorio.InscripcionRepositorio;
import com.conexionDB.CONEXIONBD.servicio.repostorioServicio.InscripcionServiciorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Component
public class EstudinateDaoImpl implements EstudianteDaoRepository {

    @Autowired
    private  EstudianteRepositorio estudianteRepositorio;





    @Override
    public List<Estudiante> findAll() {
        return estudianteRepositorio.findAll();
    }

    @Override
    public Optional<Estudiante> findById(Long id) {
        return estudianteRepositorio.findById(id);
    }

    @Override
    public void save(Estudiante estudiante) {
        estudianteRepositorio.save(estudiante);
    }

    @Override

    public void deleateById(Long id) {

        estudianteRepositorio.deleteById(id);
    }
}
