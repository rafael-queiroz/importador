package com.logic.importador.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalTime;

@Data
@AllArgsConstructor
public class GuiasPonto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Idaut")
    Long id;

    @Column(name = "IdGuia")
    Long idGuia;

    @Column(name = "Data")
    LocalTime data;

    @Column(name = "HoraMotV")
    LocalTime horaMotV;

    @Column(name = "HoraMotD")
    LocalTime horaMotD;

    @Column(name = "HoraCobV")
    LocalTime horaCobV;

    @Column(name = "HoraCobD")
    LocalTime horaCobD;

    @Column(name = "IdArquivoTXT")
    Long idArquivoTXT;

}
