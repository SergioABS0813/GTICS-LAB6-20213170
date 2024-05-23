package com.example.lab6gtics.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "reservas")
public class Reserva {
    @Id
    @Column(name = "idreservas", nullable = false)
    private Integer id;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "fechainicial")
    private LocalDate fechainicial;

    @Column(name = "fechafinal")
    private LocalDate fechafinal;

}