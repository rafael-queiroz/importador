package com.logic.importador.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
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
