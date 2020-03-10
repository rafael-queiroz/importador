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
public class Guias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Idaut")
    Long id;

    @Column(name = "Data")
    LocalTime data;

    @Column(name = "IdLinha")
    Long idLinha;

    @Column(name = "IdLinhaPrincipal")
    Long idLinhaPrincipal;

    @Column(name = "IdCarro")
    Long idCArro;

    @Column(name = "Turma")
    String turma;

    @Column(name = "IdMotorista")
    Long idMotorista;

    @Column(name = "IdCobrador")
    Long idCobrador;

    @Column(name = "SaidaGaragem")
    LocalTime dataSaidaGaragem;

    @Column(name = "Iniciante")
    String iniciante;

    @Column(name = "Encerrante")
    String encerrante;

    @Column(name = "Passageiros")
    String passageiros;

    @Column(name = "Bilhetagem")
    String bilhetagem;

    @Column(name = "Atualizado")
    String atualizado;

    @Column(name = "GPS")
    String gps;

    @Column(name = "IdArquivoTXT")
    Long idArquivoTXT;
}
