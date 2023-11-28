package com.api.xclusive.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "correo")
    private String correo;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "contrasena")
    private String contrasena;
}
