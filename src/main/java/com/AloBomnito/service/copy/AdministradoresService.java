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
	
	public Optional<Administrador> getAdmin(Long id_administrador){
		return adminRepository.findById(id_administrador);
	}
	
	public void saveOrUpdate(Administrador administrador) {
		adminRepository.save(administrador);
	}
	
	public void delete(Long id_administrador) {
		adminRepository.deleteById(id_administrador);
	}
}
