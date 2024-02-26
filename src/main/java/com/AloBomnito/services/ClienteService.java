package com.AloBomnito.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AloBomnito.modelos.Cliente;
import com.AloBomnito.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	public List<Cliente> getClientes(){
		return clienteRepository.findAll();
	}
	
	public Optional<Cliente> getCliente(Integer id_cliente){
		return clienteRepository.findById(id_cliente);
	}
	
	public Cliente saveOrUpdate(Cliente cliente){
		return clienteRepository.save(cliente);
	}
	
	public void delete(Integer id_cliente) {
		clienteRepository.deleteById(id_cliente);
	}
	
}
