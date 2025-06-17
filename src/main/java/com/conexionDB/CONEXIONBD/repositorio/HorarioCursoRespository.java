package com.conexionDB.CONEXIONBD.repositorio;

import com.conexionDB.CONEXIONBD.entity.HorarioCurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioCursoRespository extends JpaRepository<HorarioCurso,Long> {
}
