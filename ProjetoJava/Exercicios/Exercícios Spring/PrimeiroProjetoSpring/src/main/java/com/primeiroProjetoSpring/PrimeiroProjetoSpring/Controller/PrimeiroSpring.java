package com.primeiroProjetoSpring.PrimeiroProjetoSpring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PrimeiroSpring {
	
	@GetMapping("/Persistencia")
	public String Persistencia() {
		
		return "Tive que usar muito a persistência, pois passava por um momento "
				+ "muito difícil e a Camila e o Marcelo, ajudaram muito durante esse "
				+ "período. É uma mentalidade que estou usando para aprender Spring e "
				+ "levarei para o resto da minha vida.";
	}
	
	@GetMapping("/Crescimento")
	public String Crescimento() {
		
		return "Aprendi essa mentalidade o ano passado e estou vendo o quanto está "
				+ "sendo útil para aprender, não só Spring, mas também, a qualquer "
				+ "outra coisa que seja difícil.";
	}
	
	@GetMapping("/Proatividade")
	public String Proatividade() {
		
		return "Tive que usar a proatividade para poder compreender alguns pontos chaves "
				+ "onde apresentava erro e antes de perguntar aos instrutores, pesquisei "
				+ "pelo mesmo.";
	}
	
	@GetMapping("/Orientacao")
	public String Orienta() {
		
		return "Orientação ao detalhe estou usando para poder evitar erros básicos e "
				+ "tentar aprender ao máximo com esses erros.";
	}

}
