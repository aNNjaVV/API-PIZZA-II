package com.cibertec.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.blog.model.Cliente;

import com.cibertec.blog.services.IClienteService;

@RestController
@RequestMapping("/pizza")
public class ClienteController {
	
	@Autowired
	IClienteService service;
	
	@GetMapping
	public List<Cliente>listar(){
		List<Cliente> listPost = service.listar();
		return listPost;
	}
	
	

	@GetMapping("/{íd}")
	public Cliente listarPorId(@PathVariable("id")long id){
		Cliente c = service.listarPorId(id);
		return c;
	}
	
	
	@PostMapping
	public Cliente registrar(@RequestBody Cliente c) {
		Cliente cliente = service.registrar(c);
		
		return cliente;
			
	}
	
	@PutMapping
	public Cliente modificar(@RequestBody Cliente Cliente ) {
		Cliente c = service.modificar(Cliente);
		return c;
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id")long id){
		Cliente c = service.listarPorId(id);
		if(c!=null)
		service.eliminar(id);
	}
	
	

}
