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

import com.AloBomnito.modelos.Administrador;
import com.AloBomnito.services.AdministradoresService;


@RestController
@CrossOrigin(origins="*")
@RequestMapping(path = "api/v1/Admins")
public class AdministradorController {

	@Autowired
	private final AdministradoresService administradoresService = new AdministradoresService();

	@GetMapping
	public List<Administrador> getAll(){
		return administradoresService.getAdmins();
	}

	@PostMapping
	public Administrador saveOrUpdate(@RequestBody Administrador administrador){
		return administradoresService.saveOrUpdate(administrador);
	}

	@DeleteMapping("/{id_administrador}")
	public void delete(@PathVariable Integer id_administrador){
		administradoresService.delete(id_administrador);
	}

	@GetMapping("/{id_administrador}")
	public Optional<Administrador> getById(@PathVariable("id_administrador") Integer id_administrador){
		return administradoresService.getAdmin(id_administrador);
	}

}

