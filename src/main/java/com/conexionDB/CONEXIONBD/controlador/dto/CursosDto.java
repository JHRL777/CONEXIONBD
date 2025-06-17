package com.conexionDB.CONEXIONBD.controlador.dto;

import com.conexionDB.CONEXIONBD.entity.HorarioCurso;
import com.conexionDB.CONEXIONBD.entity.Inscripcion;
import com.conexionDB.CONEXIONBD.entity.Profesor;
import lombok.*;


import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CursosDto {


    private Long id;
    private String titulo;
    private String descripcion;
    private List<Inscripcion> inscripcions;
    private List<Profesor> profesors;
    private List<HorarioCurso> horarioCursos;

    public  CursosDto(String titulo, String descripcion){
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

}
