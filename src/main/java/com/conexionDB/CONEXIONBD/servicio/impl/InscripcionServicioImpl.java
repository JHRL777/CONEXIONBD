package com.conexionDB.CONEXIONBD.servicio.impl;

import com.conexionDB.CONEXIONBD.dao.repositorioDao.InscripcionDaorepository;
import com.conexionDB.CONEXIONBD.entity.Inscripcion;
import com.conexionDB.CONEXIONBD.servicio.repostorioServicio.InscripcionServiciorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InscripcionServicioImpl implements InscripcionServiciorepository {

    @Autowired
    private InscripcionDaorepository inscripcionDaorepository;

    @Override
    public List<Inscripcion> findAll() {
        return inscripcionDaorepository.findAll();
    }

    @Override
    public Optional<Inscripcion> findById(Long id) {
        return inscripcionDaorepository.findById(id);
    }

    @Override
    public void save(Inscripcion inscripcion) {
            inscripcionDaorepository.save(inscripcion);
    }

    @Override
    public void deleateById(Long id) {
            inscripcionDaorepository.deleateById(id);
    }
}
