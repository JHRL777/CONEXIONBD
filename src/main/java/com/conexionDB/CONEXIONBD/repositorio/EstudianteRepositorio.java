package com.conexionDB.CONEXIONBD.repositorio;

import com.conexionDB.CONEXIONBD.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante, Long> {
}
