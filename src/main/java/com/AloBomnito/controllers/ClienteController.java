package com.AloBomnito.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AloBomnito.modelos.Cliente;
import com.AloBomnito.services.ClienteService;


@RestController
@CrossOrigin(origins="*")
@RequestMapping(path = "api/v1/Clientes")
public class ClienteController {

	@Autowired
	private final ClienteService clienteService = new ClienteService();

	@GetMapping
	public List<Cliente> getAll(){
		return clienteService.getClientes();
	}

	@GetMapping("/{id_cliente}")
	public Optional<Cliente> getById(@PathVariable("id_cliente") Integer id_cliente){
		return clienteService.getCliente(id_cliente);
	}
	
	@PostMapping
	public Cliente crearCliente(@RequestBody Cliente cliente){
		return clienteService.saveCliente(cliente);
	}
	
	@PostMapping("editar/{id_cliente}")
	public Cliente editarCliente(@RequestBody Cliente cliente, @PathVariable Integer id_cliente){
		cliente.setId_cliente(id_cliente);
		return clienteService.updateCliente(cliente);
	}

	@DeleteMapping("/{id_cliente}")
	public void delete(@PathVariable Integer id_cliente){
		clienteService.deleteCliente(id_cliente);
	}

}
