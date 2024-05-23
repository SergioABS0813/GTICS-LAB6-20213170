package com.example.lab6gtics.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @Column(name = "idusuario", nullable = false)
    private Integer id;

    @Size(max = 45)
    @Column(name = "correo", length = 45)
    private String correo;

    @Size(max = 45)
    @Column(name = "contrasena", length = 45)
    private String contrasena;

    @Size(max = 45)
    @Column(name = "nombres", length = 45)
    private String nombres;

    @Size(max = 45)
    @Column(name = "apellidos", length = 45)
    private String apellidos;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "idRol", nullable = false)
    private Rol idRol;

}