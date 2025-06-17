package com.conexionDB.CONEXIONBD.repositorio;

import com.conexionDB.CONEXIONBD.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepositorio extends JpaRepository<Curso,Long> {
}
