package com.gestionbiblioteca.repository;

import com.gestionbiblioteca.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepository extends JpaRepository<Libro, Integer> {
}
