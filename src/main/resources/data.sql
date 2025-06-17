INSERT INTO estudiantes (nombre, email) VALUES
('Juan Pérez', 'juan.perez@example.com'),
('Ana Gómez', 'ana.gomez@example.com'),
('Carlos Martínez', 'carlos.martinez@example.com'),
('Lucía Rodríguez', 'lucia.rodriguez@example.com'),
('Pedro Sánchez', 'pedro.sanchez@example.com'),
('María López', 'maria.lopez@example.com'),
('Javier Torres', 'javier.torres@example.com'),
('Sofía Moreno', 'sofia.moreno@example.com'),
('Andrés Ramírez', 'andres.ramirez@example.com'),
('Valentina Díaz', 'valentina.diaz@example.com');

INSERT INTO cursos (titulo, descripcion) VALUES
('Programación en Java', 'Curso completo de Java desde cero'),
('Bases de Datos', 'Fundamentos de SQL y modelado relacional'),
('Spring Boot', 'Desarrollo de APIs con Spring Boot'),
('HTML y CSS', 'Diseño de páginas web modernas'),
('JavaScript', 'Programación web con JS');


INSERT INTO inscripciones (estudiante_id, curso_id, fechainscripcion) VALUES
(1, 1, '2025-04-01'),
(2, 1, '2025-04-01'),
(3, 2, '2025-04-02'),
(4, 3, '2025-04-03'),
(5, 4, '2025-04-04'),
(6, 5, '2025-04-05'),
(7, 1, '2025-04-06'),
(8, 2, '2025-04-07'),
(9, 3, '2025-04-08'),
(10, 4, '2025-04-09'),
(1, 5, '2025-04-10'),
(2, 3, '2025-04-11'),
(3, 4, '2025-04-12'),
(4, 2, '2025-04-13'),
(5, 1, '2025-04-14'),
(6, 3, '2025-04-15'),
(7, 2, '2025-04-16'),
(8, 5, '2025-04-17'),
(9, 1, '2025-04-18'),
(10, 5, '2025-04-19');
