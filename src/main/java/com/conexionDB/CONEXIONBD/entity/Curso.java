package com.conexionDB.CONEXIONBD.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cursos")
@Builder
public class Curso {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String descripcion;;

    @OneToMany(mappedBy = "curso")
    @JsonManagedReference("curso-inscripciones")
    private List<Inscripcion> inscripcions;


    @OneToMany(mappedBy = "cursoProfesor")
    @JsonManagedReference("profesor-curso")
    public List<Profesor> profesor;

    public  Curso(String titulo, String descripcion){
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    @OneToMany(mappedBy = "curso")
    @JsonManagedReference("horario_curso-curso")
    private  List<HorarioCurso> curso;

}
