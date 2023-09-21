package com.cibertec.blog.services;

import java.util.List;

import com.cibertec.blog.model.Cliente;


public interface IClienteService {
	
	Cliente registrar(Cliente c);
	
	Cliente modificar(Cliente c);

	public List<Cliente> listar();
	
	Cliente listarPorId(long id);
	
	void eliminar(long id);
}
