package com.AloBomnito.controller.copy;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AloBomnito.modelo.copy.*;
import com.AloBomnito.service.copy.*;


@RestController
@RequestMapping(path = "api/v1/Admins")
public class AdministradorController {
	
	@Autowired
	private final AdministradoresService administradoresService = new AdministradoresService();
	
	@GetMapping
	public List<Administrador> getAll(){
		return administradoresService.getAdmins();
	}
	
	@PostMapping
	public void saveOrUpdate(@RequestBody Administrador administrador){
		administradoresService.saveOrUpdate(administrador);
	}
	
	@DeleteMapping("/{id_aministrador}")
	public void saveUpdate(@PathVariable("id_administrador") Long id_administrador){
		administradoresService.delete(id_administrador);
	}

	@GetMapping("/{id_administrador}")
	public Optional<Administrador> getById(@PathVariable("id_administrador") Long id_administrador){
		return administradoresService.getAdmin(id_administrador);
	}
	
}

