package com.conexionDB.CONEXIONBD.controlador;


import com.conexionDB.CONEXIONBD.controlador.dto.InscripcionDto;
import com.conexionDB.CONEXIONBD.entity.Curso;
import com.conexionDB.CONEXIONBD.entity.Estudiante;
import com.conexionDB.CONEXIONBD.entity.Inscripcion;
import com.conexionDB.CONEXIONBD.servicio.repostorioServicio.CursoServicioRepository;
import com.conexionDB.CONEXIONBD.servicio.repostorioServicio.EstudianteServicioRepository;
import com.conexionDB.CONEXIONBD.servicio.repostorioServicio.InscripcionServiciorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/inscripcion")
public class InscripcionController {

    @Autowired
    InscripcionServiciorepository inscripcionServiciorepository;

    @Autowired
    CursoServicioRepository cursoServicioRepository;

    @Autowired
    EstudianteServicioRepository estudianteServicioRepository;

    @GetMapping("/inscreiopcionId/{id}")
    public ResponseEntity<?> insxid(@PathVariable Long id){
      Optional<Inscripcion> inscripcion = inscripcionServiciorepository.findById(id);

      if(inscripcion.isPresent()){
          Inscripcion inscripcion1 = inscripcion.get();

          InscripcionDto inscripcionDto = InscripcionDto.builder()
                  .id(inscripcion1.getId())
                  .curso(inscripcion1.getCurso())
                  .estudiante(inscripcion1.getEstudiante())
                  .fechainscripcion(inscripcion1.getFechainscripcion())
                  .build();

          return ResponseEntity.ok(inscripcionDto);



      }

      return  ResponseEntity.notFound().build();


    }

    @GetMapping("/todo")
    public ResponseEntity<?> InscripcionTodo(){
       List<Inscripcion> inscripcions = inscripcionServiciorepository.findAll();

       if (!inscripcions.isEmpty()){
           List<InscripcionDto> inscripcionDtos = inscripcions.stream().map(inscripcion -> InscripcionDto.builder()
                   .id(inscripcion.getId())
                   .curso(inscripcion.getCurso())
                   .estudiante(inscripcion.getEstudiante())
                   .fechainscripcion(inscripcion.getFechainscripcion())
                   .build()
           ).toList();

           return ResponseEntity.ok(inscripcionDtos);
       }

       return ResponseEntity.notFound().build();




    }

    @PostMapping("/guardar/{cursoId}/{estudianteId}")
    public ResponseEntity<?> guardarInscripcion(@PathVariable Long cursoId, @PathVariable Long estudianteId) {
        Optional<Curso> cursoOpt = cursoServicioRepository.findById(cursoId);
        Optional<Estudiante> estudianteOpt = estudianteServicioRepository.findById(estudianteId);

        if (cursoOpt.isEmpty() || estudianteOpt.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Curso o estudiante no encontrado");
        }

        // Crear nueva inscripción
        Inscripcion inscripcion = Inscripcion.builder()
                .curso(cursoOpt.get())
                .estudiante(estudianteOpt.get())
                .fechainscripcion(new Date()) // fecha actual, puedes personalizarlo
                .build();

        inscripcionServiciorepository.save(inscripcion);

        URI location = URI.create(String.format("/api/inscripcion/guardar/%d/%d", cursoId, estudianteId));
        return ResponseEntity.created(location).body("Inscripción guardada exitosamente");
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id){
        Optional<Inscripcion> inscripcion = inscripcionServiciorepository.findById(id);
        if(!inscripcion.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Inscripcion no encontrada");
        }

        inscripcionServiciorepository.deleateById(id);

        return ResponseEntity.ok("Eliminado");

    }


}
