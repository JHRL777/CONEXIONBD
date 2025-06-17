package com.conexionDB.CONEXIONBD.controlador.dto;

import com.conexionDB.CONEXIONBD.entity.Inscripcion;
import jdk.jshell.Snippet;
import lombok.*;

import java.util.List;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EstudianteDto {

    private Long id;
    private String nombre;
    private  String email;
    private List<Inscripcion> inscripciones;


}
