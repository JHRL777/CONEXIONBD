package com.conexionDB.CONEXIONBD.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "estudiantes")
public class Estudiante {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private  String email;

    @OneToMany(mappedBy = "estudiante")
    @JsonManagedReference("estudiante-inscripciones")
    private List<Inscripcion> inscripciones;


}
