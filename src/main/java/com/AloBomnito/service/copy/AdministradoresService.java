package com.AloBomnito.service.copy;
import com.AloBomnito.AdminRepository.copy.*;
import com.AloBomnito.modelo.copy.*;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AdministradoresService {
	
	@Autowired
	AdministradorRepository adminRepository;
	public List<Administrador> getAdmins(){
		return adminRepository.findAll();
	}
	
	public Optional<Administrador> getAdmin(int idAdministrador){
		return adminRepository.findById(idAdministrador);
	}
	
	public void saveOrUpdate(Administrador administrador) {
		adminRepository.save(administrador);
	}
	
	public void delete(int idAdministrador) {
		adminRepository.deleteById(idAdministrador);
	}
}
