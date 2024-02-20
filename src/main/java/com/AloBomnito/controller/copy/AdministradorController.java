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
@RequestMapping(path = "api/v1/administrador")
public class AdministradorController {
	
	@Autowired
	public AdministradoresService adminService;
	
	@GetMapping
	public List<Administrador> getAll(){
		return adminService.getAdmins();
	}
	
	@PostMapping
	public void saveUpdate(@RequestBody Administrador administrador){
		adminService.saveOrUpdate(administrador);
	}
	
	@DeleteMapping("/{idAministrador}")
	public void saveUpdate(@PathVariable("idAdministrador") int idAdministrador){
		adminService.delete(idAdministrador);
	}

	@GetMapping("/{idAdministrador}")
	public Optional<Administrador> getById(@PathVariable("idAdministrador") int idAdministrador){
		return adminService.getAdmin(idAdministrador);
	}
	
}

