package br.com.banco.repositories;

import br.com.banco.models.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {

   @Query("SELECT t FROM Transferencia t WHERE t.contaId.id = :contaId")
   List<Transferencia> retorneTodasAsTransferenciasPorContaId(@Param("contaId") Long contaId);

   List<Transferencia> findAllByDataTransferenciaBetween(Date dataTransferenciaComeco, Date dataTransferenciaFim);

   List<Transferencia> findAllByNomeOperacaoTransacao(String nome);

   List<Transferencia> findAllByNomeOperacaoTransacaoAndDataTransferenciaBetween(String nome, Date dataTransferenciaComeco, Date dataTransferenciaFim);
}
