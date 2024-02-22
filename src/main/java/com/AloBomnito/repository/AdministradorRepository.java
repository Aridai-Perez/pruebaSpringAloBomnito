package com.AloBomnito.repository;
import org.springframework.stereotype.*;

import com.AloBomnito.modelos.Administrador;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Integer>{

	
	

}
