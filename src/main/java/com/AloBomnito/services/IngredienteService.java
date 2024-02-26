package com.AloBomnito.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.AloBomnito.modelos.Ingrediente;
import com.AloBomnito.repository.IngredienteRepository;

@Service
public class IngredienteService {
	@Autowired
	IngredienteRepository ingredienteRepository;
	
	public List<Ingrediente> getIngredientes(){
		return ingredienteRepository.findAll();
	}
	
	public Optional<Ingrediente> getIngrediente(Integer id){
		return ingredienteRepository.findById(id);
	}
	
	public Ingrediente saveOrUpdate(Ingrediente ingrediente) {
		return ingredienteRepository.save(ingrediente);
	}
	
	public void delete(Integer id) {
		ingredienteRepository.deleteById(id);
	}
}
