package com.conexionDB.CONEXIONBD.servicio.repostorioServicio;


import com.conexionDB.CONEXIONBD.dao.impl.HorarioCursoDaoImpl;
import com.conexionDB.CONEXIONBD.entity.Estudiante;
import com.conexionDB.CONEXIONBD.entity.HorarioCurso;

import java.util.List;
import java.util.Optional;

public interface HorarioCursoServiceRepository  {

    List<HorarioCurso> findAll();
    Optional<HorarioCurso> findById(Long id);

    void save(HorarioCurso horarioCurso);
    void deleateById(Long id);


}
