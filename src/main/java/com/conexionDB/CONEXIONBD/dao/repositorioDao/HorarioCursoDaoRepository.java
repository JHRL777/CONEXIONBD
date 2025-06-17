package com.conexionDB.CONEXIONBD.dao.repositorioDao;


import com.conexionDB.CONEXIONBD.entity.HorarioCurso;
import com.conexionDB.CONEXIONBD.entity.Profesor;

import java.util.List;
import java.util.Optional;

public interface HorarioCursoDaoRepository {

    List<HorarioCurso> findAll();
    Optional<HorarioCurso> findById(Long id);

    void save(HorarioCurso profesor);
    void deleateById(Long id);


}
