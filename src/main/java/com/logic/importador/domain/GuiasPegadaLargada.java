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
public class GuiasPegadaLargada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Idaut")
    Long id;

    @Column(name = "IdGuia")
    Long idGuia;

    @Column(name = "Data")
    LocalTime data;

    @Column(name = "IdOperador")
    Long idOperador;

    @Column(name = "Funcao")
    Long funcao;

    @Column(name = "Operacao")
    Long operacao;

    @Column(name = "IdArquivoTXT")
    Long idArquicoTXT;
}
