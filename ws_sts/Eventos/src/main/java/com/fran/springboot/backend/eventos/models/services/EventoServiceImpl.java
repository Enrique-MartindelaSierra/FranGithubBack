package com.fran.springboot.backend.eventos.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fran.springboot.backend.eventos.models.entity.Evento;

@Service
public class EventoServiceImpl implements IeventoService{
	
	@Autowired
	private IeventoService eventoService;

	@Override
	@Transactional(readOnly=true)
	public List<Evento> findAll() {
		return (List<Evento>)eventoService.findAll();
	}

}
