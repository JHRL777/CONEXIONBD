package com.conexionDB.CONEXIONBD.repositorio;

import com.conexionDB.CONEXIONBD.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}
