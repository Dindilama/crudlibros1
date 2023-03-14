package com.gestionbiblioteca.service;

import com.gestionbiblioteca.model.Libro;
import com.gestionbiblioteca.repository.LibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LibrosService {
    @Autowired
    LibrosRepository librosRepository;
    public List<Libro> getAllLibros()
    {
        List<Libro> libros = new ArrayList<Libro>();
        librosRepository.findAll().forEach(libros1 -> libros.add(libros1));
        return libros;
    }
    public Libro getLibrosById(int id)
    {
        return librosRepository.findById(id).get();
    }
    public void saveOrUpdate(Libro libros)
    {
       librosRepository.save(libros);
    }
    public void delete(int id)
    {
        librosRepository.deleteById(id);
    }
    public void update(Libro libros, int libroid, Libro Libros)
    {
        librosRepository.save(Libros);
    }
}
