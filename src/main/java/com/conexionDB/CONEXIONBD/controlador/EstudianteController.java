package com.conexionDB.CONEXIONBD.controlador;

import com.conexionDB.CONEXIONBD.controlador.dto.EstudianteDto;
import com.conexionDB.CONEXIONBD.entity.Estudiante;
import com.conexionDB.CONEXIONBD.entity.Inscripcion;
import com.conexionDB.CONEXIONBD.servicio.repostorioServicio.EstudianteServicioRepository;
import com.conexionDB.CONEXIONBD.servicio.repostorioServicio.InscripcionServiciorepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/estudiante")
public class EstudianteController {

    @Autowired
    private EstudianteServicioRepository estudianteServicioRepository;





    @GetMapping("/estudianteId/{id}")
    public ResponseEntity<?> estudantexId(@PathVariable Long id){
        Optional<Estudiante> estudinteId = estudianteServicioRepository.findById(id);

        if (estudinteId.isPresent()){
            Estudiante estudiante = estudinteId.get();

            EstudianteDto estudianteDto =  new EstudianteDto();
            estudianteDto.setId(estudiante.getId());
            estudianteDto.setNombre(estudiante.getNombre());
            estudianteDto.setInscripciones(estudiante.getInscripciones());
            estudianteDto.setEmail(estudiante.getEmail());

            return ResponseEntity.ok(estudianteDto);
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping("/todo")
    public ResponseEntity<?> todosEstudiantes(){
         List<EstudianteDto> estudianteDtos =    estudianteServicioRepository.findAll().stream()
                 .map(estudiante -> EstudianteDto.builder()
                         .id(estudiante.getId())
                         .nombre(estudiante.getNombre())
                         .email(estudiante.getEmail())
                         .inscripciones(estudiante.getInscripciones())
                         .build()

                 ).collect(Collectors.toList());

         if(!estudianteDtos.isEmpty()){
             return ResponseEntity.ok(estudianteDtos);
         }else {
             return ResponseEntity.notFound().build();
         }


    }


    @PostMapping("/insertarestudiante")
    public ResponseEntity<?> insertarestudiante(@RequestBody EstudianteDto estudianteDto) throws URISyntaxException {

        if(estudianteDto.getNombre().isBlank()){

            return ResponseEntity.badRequest().build();

        }

        estudianteServicioRepository.save(Estudiante.builder().nombre(estudianteDto.getNombre()).email(estudianteDto.getEmail()).build());

        return ResponseEntity.created(new URI("/api/estudiante/insertarestudiante")).build();


    }

    @PutMapping("/actualizarestudiante/{id}")
    private ResponseEntity<?> actualizarestudiante(@PathVariable Long id,@RequestBody  EstudianteDto estudianteDto){

        Optional<Estudiante> estudianteTempo = estudianteServicioRepository.findById(id);
        String respuesta = "";
        if(estudianteTempo.isPresent()){
            Estudiante estudiante = estudianteTempo.get();
            if (estudianteDto.getNombre() != null  ) {
                if (!estudianteDto.getNombre().isBlank()){
                    String anterior = estudiante.getNombre();
                    estudiante.setNombre(estudianteDto.getNombre());
                    respuesta = "Nombre actualizado:\n" +
                            "  Anterior: {" + anterior + "}\n" +
                            "  Nuevo:    {" + estudianteDto.getNombre() + "}";
                }

            }

            if (estudianteDto.getEmail() != null) {
                if (!estudianteDto.getEmail().isBlank()){
                    String anterior = estudiante.getEmail();
                    estudiante.setEmail(estudianteDto.getEmail());
                    respuesta = respuesta+ "\nCorreo actualizado:\n" +
                            "  Anterior: {" + anterior + "}\n" +
                            "  Nuevo:    {" + estudianteDto.getEmail() + "}";
                }

            }

            estudianteServicioRepository.save(estudiante);


            return ResponseEntity.ok(respuesta);
        }

        return ResponseEntity.notFound().build();


    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarxid(@PathVariable Long id){
        if(id > 0){
            Optional<Estudiante> estudiante = estudianteServicioRepository.findById(id);
            if (estudiante.isPresent()) {

                estudianteServicioRepository.deleateById(id);

                return ResponseEntity.ok("Elimiando ok "+ id);
            }
        }else {
            ResponseEntity.badRequest().build();
        }






        return ResponseEntity.notFound().build();
    }



}
