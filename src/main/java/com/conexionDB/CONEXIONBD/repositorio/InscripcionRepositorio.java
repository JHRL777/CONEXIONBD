package com.conexionDB.CONEXIONBD.repositorio;

import com.conexionDB.CONEXIONBD.entity.Inscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscripcionRepositorio extends JpaRepository<Inscripcion,Long> {
    void deleteByEstudianteId(Long id);
}
