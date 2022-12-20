package br.com.banco.services;

import br.com.banco.models.Transferencia;
import br.com.banco.repositories.TransferenciaRepository;
import br.com.banco.utils.TransferenciaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Service
public class TransferenciaService {

   @Autowired
   private TransferenciaRepository transferenciaRepository;

   @Autowired
   private TransferenciaUtil transferenciaUtil;

   public List<Transferencia> retorneTodasAsTransferencias() {
      return transferenciaRepository.findAll();
   }

   public List<Transferencia> retorneTodasAsTransferenciasPorContaId(Long id) {
      return transferenciaRepository.retorneTodasAsTransferenciasPorContaId(id);
   }

   public List<Transferencia> retorneTodasAsTransferenciasPorData(String dataTransferenciaComeco, String dataTransferenciaFim) throws ParseException {
      Date dataComeco = transferenciaUtil.transformeStringEmData(dataTransferenciaComeco);
      Date dataFim = transferenciaUtil.transformeStringEmData(dataTransferenciaFim);

      return transferenciaRepository.findAllByDataTransferenciaBetween(dataComeco, dataFim);
   }

   public List<Transferencia> retorneTodasAsTransferenciasPorOperador(String nome) {
      return transferenciaRepository.findAllByNomeOperacaoTransacao(nome);
   }

   public List<Transferencia> retorneTodasAsTransferenciasPorOperadorEData(String nome, String dataTransferenciaComeco, String dataTransferenciaFim) throws ParseException {
      Date dataComeco = transferenciaUtil.transformeStringEmData(dataTransferenciaComeco);
      Date dataFim = transferenciaUtil.transformeStringEmData(dataTransferenciaFim);

      return transferenciaRepository.findAllByNomeOperacaoTransacaoAndDataTransferenciaBetween(nome, dataComeco, dataFim);
   }
}
