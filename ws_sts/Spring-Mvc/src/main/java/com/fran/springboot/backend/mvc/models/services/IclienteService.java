package com.fran.springboot.backend.mvc.models.services;

import java.util.List;

import com.fran.springboot.backend.mvc.models.entity.Cliente;

public interface IclienteService {
	
	public List<Cliente> findAll();  // Get buscar todos
	public Cliente findById(Long id); // Get buscar uno
	public void delete(Long id);  // Delete (Borrado)
	public Cliente save(Cliente cliente);  // Vale para POST y para PUT (Inserción y actualización)

}
