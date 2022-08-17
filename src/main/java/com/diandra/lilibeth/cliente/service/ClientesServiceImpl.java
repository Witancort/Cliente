package com.diandra.lilibeth.cliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diandra.lilibeth.cliente.model.Cliente;
import com.diandra.lilibeth.cliente.repository.ClienteRepository;

@Service
public class ClientesServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	@Override
	public List<Cliente> listar() {
		
		return repo.findAll();
	}

	@Override
	public Cliente obtenerID(Integer id) {
		
		return repo.findById(id).orElse(null);
	}

	@Override
	public void guardar(Cliente cliente) {
		repo.save(cliente);
		
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
		
	}

	@Override
	public void actualizar(Cliente cliente) {
		repo.saveAndFlush(cliente);
		
	}
	

}
