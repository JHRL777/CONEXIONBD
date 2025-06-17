package com.conexionDB.CONEXIONBD.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "horario_curso",
        uniqueConstraints = @UniqueConstraint(columnNames = {"curso_id", "horario_id"}))
public class HorarioCurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "curso_id", nullable = false)
    @JsonBackReference("horario_curso-curso")
    private Curso curso;;

    @ManyToOne()
    @JoinColumn(name = "horario_id", nullable = false)
    @JsonBackReference("horario_curso-horario")
    private Horario horario;

}
