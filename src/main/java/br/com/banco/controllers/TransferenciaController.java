package br.com.banco.controllers;

import br.com.banco.models.Transferencia;
import br.com.banco.services.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/api/v1/transferencia")
@CrossOrigin
public class TransferenciaController {

   @Autowired
   private TransferenciaService transferenciaService;

   @GetMapping()
   public ResponseEntity<List<Transferencia>> retorneTodasAsTransferencias() {
      var transferencias = transferenciaService.retorneTodasAsTransferencias();
      return ResponseEntity.ok(transferencias);
   }

   @GetMapping("/porConta/{contaId}")
   public ResponseEntity<List<Transferencia>> retorneTodasAsTransferenciasPorContaId(@PathVariable Long contaId) {
      var transferencias = transferenciaService.retorneTodasAsTransferenciasPorContaId(contaId);
      return ResponseEntity.ok(transferencias);
   }

   @GetMapping("/porData")
   public ResponseEntity<List<Transferencia>> retorneTodasAsTransferenciasPorData(@RequestParam (value = "dataTransferenciaComeco") String dataTransferenciaComeco,
                                                                                  @RequestParam (value = "dataTransferenciaFim") String dataTransferenciaFim) throws ParseException {

      var transferencias = transferenciaService.retorneTodasAsTransferenciasPorData(dataTransferenciaComeco, dataTransferenciaFim);

      return ResponseEntity.ok(transferencias);
   }

   @GetMapping("/porOperador")
   public ResponseEntity<List<Transferencia>> retorneTodasAsTransferenciasPorOperador(@PathVariable String NomeOperacaoTransacao) {
      var transferencias = transferenciaService.retorneTodasAsTransferenciasPorOperador(NomeOperacaoTransacao);

      return ResponseEntity.ok(transferencias);
   }

   @GetMapping("/porOperadorEData/{NomeOperacaoTransacao}")
   public ResponseEntity<List<Transferencia>> retorneTodasAsTransferenciasPorOperadorEData(@PathVariable String NomeOperacaoTransacao,
                                                                                           @RequestParam (value = "dataTransferenciaComeco") String dataTransferenciaComeco,
                                                                                           @RequestParam (value = "dataTransferenciaFim") String dataTransferenciaFim) throws ParseException {

      var transferencias = transferenciaService.retorneTodasAsTransferenciasPorOperadorEData(NomeOperacaoTransacao,
                                                                                                             dataTransferenciaComeco,
                                                                                                             dataTransferenciaFim);
      return ResponseEntity.ok(transferencias);
   }

}
