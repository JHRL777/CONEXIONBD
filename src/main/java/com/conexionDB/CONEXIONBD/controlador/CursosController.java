package com.conexionDB.CONEXIONBD.controlador;

import com.conexionDB.CONEXIONBD.controlador.dto.CursosDto;
import com.conexionDB.CONEXIONBD.entity.Curso;
import com.conexionDB.CONEXIONBD.servicio.repostorioServicio.CursoServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cursos")
public class CursosController {

    @Autowired
    private CursoServicioRepository cursoServicioRepository;

    @GetMapping("/cursoid/{id}")
    private ResponseEntity<?> cursosid(@PathVariable Long id){
       Optional<Curso> curso =  cursoServicioRepository.findById(id);

       if(curso.isPresent()){
           Curso  curso1 = curso.get();
           CursosDto cursosDto = CursosDto.builder()
                   .id(curso1.getId())
                   .titulo(curso1.getTitulo())
                   .descripcion(curso1.getDescripcion())
                   .inscripcions(curso1.getInscripcions())
                   .profesors(curso1.getProfesor())
                   .horarioCursos(curso1.getCurso())
                   .build();
           return ResponseEntity.ok(cursosDto);

       }

       return ResponseEntity.notFound().build();

    }

    @GetMapping("/todo")
    private ResponseEntity<?> cursoTodo() {
       List<CursosDto> cursosDtos =  cursoServicioRepository
               .findAll().stream().map(e -> CursosDto
                       .builder()
                       .id(e.getId())
                       .titulo(e.getTitulo())
                       .descripcion(e.getDescripcion())
                       .inscripcions(e.getInscripcions())
                       .profesors(e.getProfesor())
                       .build()).toList();

       if (!cursosDtos.isEmpty()){
           return ResponseEntity.ok(cursosDtos);

       }else {
           return ResponseEntity.notFound().build();
       }
    }

    @PostMapping("/insetarCurso")
    private ResponseEntity<?> crearCurso(@RequestBody CursosDto cursosDto) throws URISyntaxException {

        if(cursosDto.getTitulo().isBlank()){
            ResponseEntity.notFound().build();
        }

        Curso curso = new Curso(cursosDto.getTitulo(),cursosDto.getDescripcion());
        cursoServicioRepository.save(curso);

        return ResponseEntity.created(new URI("/api/cursos/crear")).build();

    }

    @PutMapping("/actualizarCurso/{id}")
    public ResponseEntity<?> insertarCurso(@PathVariable Long id, @RequestBody CursosDto  cursosDto){
        Optional<Curso> curso = cursoServicioRepository.findById(id);
        if (curso.isPresent()){
            Curso curso1 = curso.get();
            curso1.setTitulo(cursosDto.getTitulo());
            curso1.setDescripcion(cursosDto.getDescripcion());
            cursoServicioRepository.save(curso1);
            //Curso curso2 = Curso.builder().titulo(cursosDto.getTitulo()).descripcion(cursosDto.getDescripcion()).build();
            return ResponseEntity.ok("Acttualizacion ok del id"+ curso1.getId());
        }

        return ResponseEntity.badRequest().build();


    }



}
