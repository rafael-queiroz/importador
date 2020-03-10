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
public class GuiasFicalLiber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Idaut")
    Long id;

    @Column(name = "IdGuia")
    Long idGuia;

    @Column(name = "Data")
    LocalTime data;

    @Column(name = "Cartao")
    String cartao;

    @Column(name = "Aplicacao")
    String aplicacao;

    @Column(name = "IdArquivoTXT")
    Long idArquivoTXT;
}
