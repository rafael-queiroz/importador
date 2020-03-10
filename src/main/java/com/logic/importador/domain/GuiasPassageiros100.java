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
public class GuiasPassageiros100 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Idaut")
    Long id;

    @Column(name = "IdGuia")
    Long idGuia;

    @Column(name = "Data")
    LocalTime data;

    @Column(name = "Hora")
    Long hora;

    @Column(name = "IdLinha")
    String idLinha;

    @Column(name = "Carro")
    String carro;

    @Column(name = "Motorista")
    String motorista;

    @Column(name = "Cobrador")
    String cobrador;

    @Column(name = "Aplicacao")
    String aplicacao;

    @Column(name = "AplicacaoEmissor")
    String aplicacaoEmissor;

    @Column(name = "NumeroSerie")
    String numeroSerie;

    @Column(name = "Transacao")
    Long transacao;

    @Column(name = "Valor")
    String valor;

    @Column(name = "Sentido")
    String sentido;

    @Column(name = "Turno")
    String turno;

    @Column(name = "EstadoServico")
    String estadoServico;

    @Column(name = "Status")
    String status;

    @Column(name = "Switch")
    String swtch;

    @Column(name = "TipoEmbarque")
    String tipoEmbarque;

    @Column(name = "TipoIntegracao")
    String tipoIntegracao;

    @Column(name = "TipoDebito")
    String tipoDebito;

    @Column(name = "IdArquivoTXT")
    Long idArquivoTXT;

    @Column(name = "Tarifa_BU")
    String tarifaBu;

    @Column(name = "DataHora")
    LocalTime dataHora;

    @Column(name = "Roleta2")
    Long roleta2;

    @Column(name = "Versao")
    Long versao;

    @Column(name = "LinhaTXT")
    Long linhaTXT;

    @Column(name = "Tarifa")
    String tarifa;

    @Column(name = "DataCredito")
    LocalTime dataCredito;

    @Column(name = "ChipSam")
    String chipSam;

    @Column(name = "Numero_Interno")
    String numeroInterno;

    @Column(name = "Valor_Tarifa")
    String valorTarifa;

    @Column(name = "Data_UDPGarage")
    LocalTime dataUdpGarage;

}
