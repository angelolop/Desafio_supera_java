package br.com.banco.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table
public class Transferencia {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column
   private Long id;

   @Column(name = "DATA_TRANSFERENCIA")
   @Temporal(TemporalType.DATE)
   private Date dataTransferencia;

   @Column(name = "VALOR")
   private Double valor;

   @Column(name = "TIPO")
   private String tipo;

   @Column(name = "NOME_OPERADOR_TRANSACAO")
   private String nomeOperacaoTransacao;

   @ManyToOne
   @JoinColumn(name = "CONTA_ID")
   private Conta contaId;
}
