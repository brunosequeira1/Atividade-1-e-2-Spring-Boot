package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping("/rota1")
	public String hello() {
		return "Hello Generation!";
	
	}
	
	@RequestMapping(value = "/rota2", method = RequestMethod.GET )
	public String mentalidadeController() {
		return "Utilizamos a Mentalidade de Persistência e a Habilidade de Orientação aos Detalhes.";
	}

	@GetMapping ("/rota3")
	public String objetivos() {
		return "Meus objetivos de aprendizagem para esta semana estão voltados para um bom uso do banco de dados com MySQL, aprender "
				+ "e desenvolver bem em Spring Boot, e tentar agregar essas novas informações no projeto integrador, além"
				+ " de aprender as novidades das aulas passadas pelo professor.";
	}
}
