package br.com.banco.unittests;

import br.com.banco.mocks.MockTransferencia;
import br.com.banco.models.Transferencia;
import br.com.banco.repositories.TransferenciaRepository;
import br.com.banco.services.TransferenciaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TransferenciaServiceTest {

   MockTransferencia input;

   @InjectMocks
   private TransferenciaService service;

   @Mock
   TransferenciaRepository repository;

   @BeforeEach
   void setUpMocks() throws Exception{
      input = new MockTransferencia();
      MockitoAnnotations.openMocks(this);
   }


   @Test
   void retorneTodasAsTransferenciasPorContaIdTeste() throws Exception {
      List<Transferencia> entity = input.mockEntityList();

      when(repository.retorneTodasAsTransferenciasPorContaId(1L)).thenReturn(entity);
      var transferencias = service.retorneTodasAsTransferenciasPorContaId(1L);
      assertNotNull(transferencias);
      assertEquals(14, transferencias.size());

      var transferencia = transferencias.get(1);
      assertNotNull(transferencia);
      assertNotNull(transferencia.getId());
      assertNotNull(transferencia.getDataTransferencia());
      assertNotNull(transferencia.getValor());
      assertNotNull(transferencia.getTipo());
      assertNotNull(transferencia.getNomeOperacaoTransacao());
      assertNotNull(transferencia.getContaId());
   }
}
