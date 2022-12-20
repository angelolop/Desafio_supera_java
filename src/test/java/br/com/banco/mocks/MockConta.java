package br.com.banco.mocks;

import br.com.banco.models.Conta;

import java.util.ArrayList;
import java.util.List;

public class MockConta {

   public Conta mockEntity() {
      return mockEntity(0);
   }

   public List<Conta> mockEntityList() {
      List<Conta> books = new ArrayList<Conta>();
      for (int i = 0; i < 14; i++) {
         books.add(mockEntity(i));
      }
      return books;
   }

   public Conta mockEntity(Integer number) {
      Conta conta = new Conta();
      conta.setId(number.longValue());
      conta.setNomeResponsavel(((number % 2)==0) ? "FULANO" : "CICLANO");
      return conta;
   }
}
