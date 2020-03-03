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
public class GuiasPontoChecagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Idaut")
    Long id;

    @Column(name = "IdGuia")
    Long idGTuia;

    @Column(name = "Data")
    LocalTime data;

    @Column(name = "Hora")
    LocalTime hora;

    @Column(name = "NumeroSerie")
    String numeroSerie;

    @Column(name = "IdOperador")
    Long idOperador;

    @Column(name = "IdArquivoTXT")
    Long idArquivoTXT;
}
