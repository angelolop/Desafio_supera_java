package br.com.banco.mocks;

import br.com.banco.models.Transferencia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MockTransferencia {

   public Transferencia mockEntity() {
      return mockEntity(0);
   }

   public List<Transferencia> mockEntityList() {
      List<Transferencia> books = new ArrayList<Transferencia>();
      for (int i = 0; i < 14; i++) {
         books.add(mockEntity(i));
      }
      return books;
   }

   public Transferencia mockEntity(Integer number) {
      Transferencia transferencia = new Transferencia();
      MockConta mockConta = new MockConta();
      transferencia.setId(number.longValue());
      transferencia.setDataTransferencia(new Date());
      transferencia.setValor(number.doubleValue());
      transferencia.setNomeOperacaoTransacao(((number % 2)==0) ? "FULANO" : "SICRANO");
      transferencia.setTipo(((number % 2)==0) ? "DEPOSITO" : "SAQUE");
      transferencia.setContaId(mockConta.mockEntity(number));
      return transferencia;
   }
}
