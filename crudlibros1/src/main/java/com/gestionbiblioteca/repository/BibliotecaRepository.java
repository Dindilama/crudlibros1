package com.gestionbiblioteca.repository;

import com.gestionbiblioteca.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  BibliotecaRepository extends JpaRepository<Libro, Integer> {
}
