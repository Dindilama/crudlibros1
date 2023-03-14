package com.gestionbiblioteca.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Prestamo {
    @Id
    @Column
    private int id;
    @Column
    private String nombre;
    @Column
    private int cantDias;
    @Column
    private boolean devuelto;
}
