package br.com.banco.models;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table
public class Conta {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "ID_CONTA")
   private Long id;

   @Column(name = "NOME_RESPONSAVEL")
   private String nomeResponsavel;
}
