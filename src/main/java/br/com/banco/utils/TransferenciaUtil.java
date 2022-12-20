package br.com.banco.utils;

import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TransferenciaUtil {

   public Date transformeStringEmData(String data) throws ParseException {
      return new SimpleDateFormat("yyyy-MM-dd").parse(data);
   }
}
