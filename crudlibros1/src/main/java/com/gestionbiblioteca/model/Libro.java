package com.gestionbiblioteca.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Libro {
    @Id
    @Column
    private int libroid;
    @Column
    private String nombreLibro;
    @Column
    private String autor;
    @Column
    private int precioMulta;

    public int getLibroid() {
        return libroid;
    }

    public void setLibroid(int libroid) {
        this.libroid = libroid;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecioMulta() {
        return precioMulta;
    }

    public void setPrecioMulta(int precioMulta) {
        this.precioMulta = precioMulta;
    }

}



