package com.AloBomnito.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AloBomnito.modelos.Administrador;
import com.AloBomnito.repository.AdministradorRepository;

@Service
public class AdministradoresService {

	@Autowired
	AdministradorRepository adminRepository;

	public List<Administrador> getAdmins(){
		return adminRepository.findAll();
	}

	public Optional<Administrador> getAdmin(Integer id_administrador){
		return adminRepository.findById(id_administrador);
	}

	public Administrador saveOrUpdate(Administrador administrador) {
		return adminRepository.save(administrador);
	}

	public void delete(Integer id_administrador) {
		adminRepository.deleteById(id_administrador);
	}
}
