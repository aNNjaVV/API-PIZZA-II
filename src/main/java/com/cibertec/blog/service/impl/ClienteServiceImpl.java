package com.cibertec.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.blog.model.Cliente;
import com.cibertec.blog.repo.IClienteRepo;
import com.cibertec.blog.services.IClienteService;


@Service
public class ClienteServiceImpl implements IClienteService{

	
	@Autowired
	IClienteRepo iClienteRepo;

	@Override
	public Cliente registrar(Cliente c) {
		// TODO Auto-generated method stub
		return iClienteRepo.save(c);
	}
	
	@Override
	public Cliente modificar(Cliente c) {
		// TODO Auto-generated method stub
		return iClienteRepo.save(c);
	}


	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return iClienteRepo.findAll();
	}
	
	@Override
	public Cliente listarPorId(long id) {
		// TODO Auto-generated method stub
		return iClienteRepo.findById(id).get();
	}

	@Override
	public void eliminar(long id) {
		// TODO Auto-generated method stub
		iClienteRepo.deleteById(id);
	}

	
	

}
