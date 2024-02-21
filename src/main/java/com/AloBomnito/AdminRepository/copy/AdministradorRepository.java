package com.AloBomnito.AdminRepository.copy;
import org.springframework.stereotype.*;
import com.AloBomnito.modelo.copy.Administrador;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Long>{
	

}
