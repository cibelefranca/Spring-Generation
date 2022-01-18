package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mentalidade")
public class HelloController {

   @GetMapping
   public String mentalidade() {
	   return "usei muita persistência,e muita atenção ao detalhe para entender a lógica da API";
   }
   
   @GetMapping("/2")
   public String objetivos() {
	   return "meu objetivo é melhorar bem mais na questão de atenção aos detalhes e manter mentalidade de crescimento";
   }
}
