package com.cibertec.blog.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.blog.model.Cliente;



public interface IClienteRepo  extends JpaRepository<Cliente, Long>{

}
