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
public class GuiasMov {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Idaut")
    Long id;

    @Column(name = "IdGuia")
    Long idGuia;

    @Column(name = "Data")
    LocalTime data;

    @Column(name = "IdLinha")
    Long idLinha;

    @Column(name = "IdLinhaPrincipal")
    Long idLinhaPrincipal;

    @Column(name = "IdCarro")
    Long idCarro;

    @Column(name = "Turma")
    String turma;

    @Column(name = "Viagem")
    Long viagem;

    @Column(name = "Sentido")
    Long sentido;

    @Column(name = "HoraSaida")
    LocalTime horaSaida;

    @Column(name = "HoraChegada")
    LocalTime horaChegada;

    @Column(name = "Tempo")
    LocalTime tempo;

    @Column(name = "Iniciante")
    String iniciante;

    @Column(name = "Encerrante")
    String encerrante;

    @Column(name = "Passageiros")
    String passageiros;

    @Column(name = "TempoInt")
    Long tempoInt;

    @Column(name = "VendaBordo")
    Long vendaBordo;

    @Column(name = "ValeTransporte")
    Long valeTransporte;

    @Column(name = "ValeTransporte_BU")
    Long valeTransporteBu;

    @Column(name = "BU_Carioca")
    Long buCarioca;

    @Column(name = "Gratuidade")
    Long gratuidade;

    @Column(name = "Valor_VendaBordo")
    Long valorVendaBordo;

    @Column(name = "Valor_ValeTransporte")
    Long valorValeTransporte;

    @Column(name = "Valor_ValeTransporte_BU")
    Long valorValeTransporteBu;

    @Column(name = "Valor_BU_Carioca")
    Long valorBuCarioca;

    @Column(name = "Bilhetagem")
    String bilhetagem;

    @Column(name = "Atualizado")
    String atualizado;

    @Column(name = "IdArquivoTXT")
    Long idArquivoTXT;
}
