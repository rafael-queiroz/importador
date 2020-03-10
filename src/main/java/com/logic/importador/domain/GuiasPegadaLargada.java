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
