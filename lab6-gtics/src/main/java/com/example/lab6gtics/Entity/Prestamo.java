package com.example.lab6gtics.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "prestamos")
public class Prestamo {
    @EmbeddedId
    private PrestamoId id;

    @MapsId("usuarioIdusuario")
    @ManyToOne
    @JoinColumn(name = "usuario_idusuario", nullable = false)
    private Usuario usuarioIdusuario;

    @MapsId("dispositivoIddispositivo")
    @ManyToOne
    @JoinColumn(name = "dispositivo_iddispositivo", nullable = false)
    private Dispositivo dispositivoIddispositivo;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "fechainicial")
    private LocalDate fechainicial;

    @Column(name = "fechafinal")
    private LocalDate fechafinal;

    @Size(max = 45)
    @Column(name = "nombreResponsable", length = 45)
    private String nombreResponsable;

}