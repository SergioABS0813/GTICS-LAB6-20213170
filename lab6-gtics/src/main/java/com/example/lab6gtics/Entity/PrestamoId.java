package com.example.lab6gtics.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class PrestamoId implements Serializable {

    @NotNull
    @Column(name = "idprestamos", nullable = false)
    private Integer idprestamos;

    @NotNull
    @Column(name = "usuario_idusuario", nullable = false)
    private Integer usuarioIdusuario;

    @NotNull
    @Column(name = "dispositivo_iddispositivo", nullable = false)
    private Integer dispositivoIddispositivo;

}