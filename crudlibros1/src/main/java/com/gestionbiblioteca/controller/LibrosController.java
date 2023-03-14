package com.gestionbiblioteca.controller;

import java.util.List;

import com.gestionbiblioteca.model.Libro;
import com.gestionbiblioteca.service.LibrosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibrosController {
    @Autowired
    LibrosService librosService;
    @GetMapping("/getAllLibros")
    private List<Libro> getAllLibros()
    {
        return librosService.getAllLibros();
    }
    @GetMapping("/libro/{libroid}")
    private Libro getLibros(@PathVariable("libroid") int libroid)
    {
        return librosService.getLibrosById(libroid);
    }
    @DeleteMapping("/libro/{libroid}")
    private void deleteLibro(@PathVariable("libroid") int libroid)
    {
        librosService.delete(libroid);
    }
    @PostMapping("/saveLibro")
    private Libro saveLibro(@RequestBody Libro libros)
    {
        librosService.saveOrUpdate(libros);
        return libros;
    }
    @PutMapping("/updateLibros")
    private Libro update(@RequestBody Libro libros)
    {
        librosService.saveOrUpdate(libros);
        return libros;
    }
}
