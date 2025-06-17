package com.conexionDB.CONEXIONBD.controlador.dto;

import com.conexionDB.CONEXIONBD.entity.Curso;
import com.conexionDB.CONEXIONBD.entity.Horario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HorariosCursoDto {



    private Long id;


    private Curso curso;;


    private Horario horario;

}
