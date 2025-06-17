package com.conexionDB.CONEXIONBD.controlador.dto;

import com.conexionDB.CONEXIONBD.entity.Curso;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProfesoDto {


    private Long id;
    private String nombre;
    private String curso;

}
