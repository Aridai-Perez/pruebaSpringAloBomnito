package com.AloBomnito.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AloBomnito.modelos.Compras;
import com.AloBomnito.repository.ComprasRepository;

@Service
public class ComprasService {
	@Autowired
	ComprasRepository comprasRepository;

	public List<Compras> getCompras(){
		return comprasRepository.findAll();
	}

	public Optional<Compras> getCompra(Integer id){
		return comprasRepository.findById(id);
	}

	public Compras saveOrUpdate(Compras compra) {
		return comprasRepository.save(compra);
	}

	public void delete(Integer id) {
		comprasRepository.deleteById(id);
	}
}
