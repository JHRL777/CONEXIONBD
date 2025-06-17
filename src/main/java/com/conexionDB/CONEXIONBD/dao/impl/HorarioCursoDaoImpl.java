package com.conexionDB.CONEXIONBD.dao.impl;


import com.conexionDB.CONEXIONBD.dao.repositorioDao.HorarioCursoDaoRepository;
import com.conexionDB.CONEXIONBD.entity.HorarioCurso;
import com.conexionDB.CONEXIONBD.repositorio.HorarioCursoRespository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class HorarioCursoDaoImpl implements HorarioCursoDaoRepository {
    @Override
    public List<HorarioCurso> findAll() {
        return null;
    }

    @Override
    public Optional<HorarioCurso> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(HorarioCurso profesor) {

    }

    @Override
    public void deleateById(Long id) {

    }
}
