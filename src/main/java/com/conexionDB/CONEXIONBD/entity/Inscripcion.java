package com.conexionDB.CONEXIONBD.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "inscripciones")
@Builder
public class Inscripcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    @JsonBackReference("estudiante-inscripciones")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    @JsonBackReference("curso-inscripciones")
    private Curso curso;

    private Date fechainscripcion;

}
