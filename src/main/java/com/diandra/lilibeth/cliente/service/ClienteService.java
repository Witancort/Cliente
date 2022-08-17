package com.diandra.lilibeth.cliente.service;

import java.util.List;

import com.diandra.lilibeth.cliente.model.Cliente;

public interface ClienteService {
	
	List<Cliente> listar();
	Cliente obtenerID(Integer id);
	void guardar(Cliente cliente);
	void eliminar(Integer id);
	void actualizar(Cliente cliente);

}
