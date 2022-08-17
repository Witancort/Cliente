package com.diandra.lilibeth.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diandra.lilibeth.cliente.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	

}
