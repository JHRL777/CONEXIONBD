package com.conexionDB.CONEXIONBD.controlador.dto;

import com.conexionDB.CONEXIONBD.entity.Curso;
import com.conexionDB.CONEXIONBD.entity.Estudiante;
import lombok.*;


import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InscripcionDto {



    private Long id;
    private Estudiante estudiante;
    private Curso curso;
    private Date fechainscripcion;


}
