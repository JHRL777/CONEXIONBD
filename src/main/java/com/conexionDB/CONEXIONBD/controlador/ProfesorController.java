package com.conexionDB.CONEXIONBD.controlador;


import com.conexionDB.CONEXIONBD.controlador.dto.ProfesoDto;
import com.conexionDB.CONEXIONBD.entity.Profesor;
import com.conexionDB.CONEXIONBD.servicio.repostorioServicio.ProfesorServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/profesor")
public class ProfesorController {

    @Autowired
    ProfesorServicioRepository profesorServicioRepository;

    @GetMapping("/todos")
    public ResponseEntity<?> todos(){
       List<Profesor> profesorsTem =  profesorServicioRepository.findAll();

       if(!profesorsTem.isEmpty()){


           List<ProfesoDto> profesoDtos = profesorsTem.stream().map(p ->
                   ProfesoDto.builder()
                           .id(p.getId())
                           .nombre(p.getNombre())
                           .curso(p.getCursoProfesor().getTitulo())
                           .build()).toList();

           return ResponseEntity.ok(profesoDtos);
       }

       return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontraron datos");

    }

}
