INSERT INTO estudiantes (nombre, email) VALUES ('Juan Pérez', 'juan.perez@example.com');
INSERT INTO estudiantes (nombre, email) VALUES ('Ana Gómez', 'ana.gomez@example.com');
INSERT INTO estudiantes (nombre, email) VALUES ('Carlos Martínez', 'carlos.martinez@example.com');
INSERT INTO estudiantes (nombre, email) VALUES ('Lucía Rodríguez', 'lucia.rodriguez@example.com');
INSERT INTO estudiantes (nombre, email) VALUES ('Pedro Sánchez', 'pedro.sanchez@example.com');
INSERT INTO estudiantes (nombre, email) VALUES ('María López', 'maria.lopez@example.com');
INSERT INTO estudiantes (nombre, email) VALUES ('Javier Torres', 'javier.torres@example.com');
INSERT INTO estudiantes (nombre, email) VALUES ('Sofía Moreno', 'sofia.moreno@example.com');
INSERT INTO estudiantes (nombre, email) VALUES ('Andrés Ramírez', 'andres.ramirez@example.com');
INSERT INTO estudiantes (nombre, email) VALUES ('Valentina Díaz', 'valentina.diaz@example.com');

INSERT INTO cursos (titulo, descripcion) VALUES ('Programación en Java', 'Curso completo de Java desde cero');
INSERT INTO cursos (titulo, descripcion) VALUES ('Bases de Datos', 'Fundamentos de SQL y modelado relacional');
INSERT INTO cursos (titulo, descripcion) VALUES ('Spring Boot', 'Desarrollo de APIs con Spring Boot');
INSERT INTO cursos (titulo, descripcion) VALUES ('HTML y CSS', 'Diseño de páginas web modernas');
INSERT INTO cursos (titulo, descripcion) VALUES ('JavaScript', 'Programación web con JS');

INSERT INTO inscripciones (estudiante_id, curso_id, fechainscripcion) VALUES (1, 1, '2025-04-01');
INSERT INTO inscripciones (estudiante_id, curso_id, fechainscripcion) VALUES (2, 1, '2025-04-01');
INSERT INTO inscripciones (estudiante_id, curso_id, fechainscripcion) VALUES (3, 2, '2025-04-02');
INSERT INTO inscripciones (estudiante_id, curso_id, fechainscripcion) VALUES (4, 3, '2025-04-03');
INSERT INTO inscripciones (estudiante_id, curso_id, fechainscripcion) VALUES (5, 4, '2025-04-04');
INSERT INTO inscripciones (estudiante_id, curso_id, fechainscripcion) VALUES (6, 5, '2025-04-05');
INSERT INTO inscripciones (estudiante_id, curso_id, fechainscripcion) VALUES (7, 1, '2025-04-06');
INSERT INTO inscripciones (estudiante_id, curso_id, fechainscripcion) VALUES (8, 2, '2025-04-07');
INSERT INTO inscripciones (estudiante_id, curso_id, fechainscripcion) VALUES (9, 3, '2025-04-08');
INSERT INTO inscripciones (estudiante_id, curso_id, fechainscripcion) VALUES (10, 4, '2025-04-09');
INSERT INTO inscripciones (estudiante_id, curso_id, fechainscripcion) VALUES (1, 5, '2025-04-10');
INSERT INTO inscripciones (estudiante_id, curso_id, fechainscripcion) VALUES (2, 3, '2025-04-11');
INSERT INTO inscripciones (estudiante_id, curso_id, fechainscripcion) VALUES (3, 4, '2025-04-12');
INSERT INTO inscripciones (estudiante_id, curso_id, fechainscripcion) VALUES (4, 2, '2025-04-13');
INSERT INTO inscripciones (estudiante_id, curso_id, fechainscripcion) VALUES (5, 1, '2025-04-14');
INSERT INTO inscripciones (estudiante_id, curso_id, fechainscripcion) VALUES (6, 3, '2025-04-15');
INSERT INTO inscripciones (estudiante_id, curso_id, fechainscripcion) VALUES (7, 2, '2025-04-16');
INSERT INTO inscripciones (estudiante_id, curso_id, fechainscripcion) VALUES (8, 5, '2025-04-17');
INSERT INTO inscripciones (estudiante_id, curso_id, fechainscripcion) VALUES (9, 1, '2025-04-18');
INSERT INTO inscripciones (estudiante_id, curso_id, fechainscripcion) VALUES (10, 5, '2025-04-19');

INSERT INTO PROFESOR (NOMBRE,CURSO_ID) VALUES('Profe Juan',1);
INSERT INTO PROFESOR (NOMBRE,CURSO_ID) VALUES('Profe Mauricio',1);
INSERT INTO PROFESOR (NOMBRE,CURSO_ID) VALUES('Profe Jose',2);
INSERT INTO PROFESOR (NOMBRE,CURSO_ID) VALUES('Profe Nicolas',2);
INSERT INTO PROFESOR (NOMBRE,CURSO_ID) VALUES('Profesora Maira',3);
INSERT INTO PROFESOR (NOMBRE,CURSO_ID) VALUES('Profesora Jimanea',3);
INSERT INTO PROFESOR (NOMBRE,CURSO_ID) VALUES('Profe Pedro',3);

-- Insertando un horario que comienza a las 8:00 AM y termina a las 9:00 AM
INSERT INTO horarios (fecha_inicio, fecha_fin) VALUES ('2025-05-16 08:00:00', '2025-05-16 09:00:00');

-- Insertando un horario que comienza a las 9:00 AM y termina a las 10:00 AM
INSERT INTO horarios (fecha_inicio, fecha_fin) VALUES ('2025-05-16 09:00:00', '2025-05-16 10:00:00');

-- Insertando un horario que comienza a las 10:00 AM y termina a las 11:00 AM
INSERT INTO horarios (fecha_inicio, fecha_fin) VALUES ('2025-05-16 10:00:00', '2025-05-16 11:00:00');

-- Insertando un horario que comienza a las 11:00 AM y termina a las 12:00 PM
INSERT INTO horarios (fecha_inicio, fecha_fin) VALUES ('2025-05-16 11:00:00', '2025-05-16 12:00:00');

-- Insertando un horario que comienza a las 12:00 PM (mediodía) y termina a la 1:00 PM
INSERT INTO horarios (fecha_inicio, fecha_fin) VALUES ('2025-05-16 12:00:00', '2025-05-16 13:00:00');

-- Insertando un horario que comienza a la 1:00 PM y termina a las 2:00 PM
INSERT INTO horarios (fecha_inicio, fecha_fin) VALUES ('2025-05-16 13:00:00', '2025-05-16 14:00:00');

-- Insertando un horario que comienza a las 2:00 PM y termina a las 3:00 PM
INSERT INTO horarios (fecha_inicio, fecha_fin) VALUES ('2025-05-16 14:00:00', '2025-05-16 15:00:00');

-- Insertando un horario que comienza a las 3:00 PM y termina a las 4:00 PM
INSERT INTO horarios (fecha_inicio, fecha_fin) VALUES ('2025-05-16 15:00:00', '2025-05-16 16:00:00');

-- Insertando un horario que comienza a las 4:00 PM y termina a las 5:00 PM
INSERT INTO horarios (fecha_inicio, fecha_fin) VALUES ('2025-05-16 16:00:00', '2025-05-16 17:00:00');

-- Insertando un horario que comienza a las 5:00 PM y termina a las 6:00 PM
INSERT INTO horarios (fecha_inicio, fecha_fin) VALUES ('2025-05-16 17:00:00', '2025-05-16 18:00:00');




INSERT INTO horario_curso (curso_id, horario_id) VALUES (1, 1);
INSERT INTO horario_curso (curso_id, horario_id) VALUES (1, 2);
INSERT INTO horario_curso (curso_id, horario_id) VALUES (2, 3);
INSERT INTO horario_curso (curso_id, horario_id) VALUES (2, 4);
INSERT INTO horario_curso (curso_id, horario_id) VALUES (3, 5);
INSERT INTO horario_curso (curso_id, horario_id) VALUES (3, 1);
INSERT INTO horario_curso (curso_id, horario_id) VALUES (4, 2);
INSERT INTO horario_curso (curso_id, horario_id) VALUES (3, 1);
INSERT INTO horario_curso (curso_id, horario_id) VALUES (4, 2);