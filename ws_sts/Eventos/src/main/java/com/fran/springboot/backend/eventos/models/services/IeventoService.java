package com.fran.springboot.backend.eventos.models.services;

import java.util.List;

import com.fran.springboot.backend.eventos.models.entity.Evento;

public interface IeventoService {
	
	public List<Evento> findAll();
	public Evento findById(int id);

}
