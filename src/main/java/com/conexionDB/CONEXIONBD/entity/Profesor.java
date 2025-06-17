package com.conexionDB.CONEXIONBD.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Profesor {
    // un profesor solo pude tener un curso y un curso puede tener varios profesores.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @ManyToOne
    @JsonBackReference("profesor-curso")
    @JoinColumn(name = "curso_id")
    private Curso cursoProfesor;


}
