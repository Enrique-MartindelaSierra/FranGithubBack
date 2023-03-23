package com.fran.springboot.backend.eventos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fran.springboot.backend.eventos.models.entity.Evento;
import com.fran.springboot.backend.eventos.models.services.IeventoService;

@CrossOrigin(origins= {"*"})  // Todas las aplicaciones pueden acceder a los servicios web
@RestController
@RequestMapping("/eventos")
public class EventoRestController {
	
	@Autowired
	private IeventoService eventoService;
	
	@GetMapping("")
	public List<Evento> index(){
		return eventoService.findAll();
	}
	
	@GetMapping("/{id}")  // Muestra un solo cliente
	public Evento show(@PathVariable int id){
		return eventoService.findById(id);
	}
	
}
