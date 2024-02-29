package com.AloBomnito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AloBomnito.modelos.Ingrediente;

@Repository
public interface IngredienteRepository extends JpaRepository <Ingrediente, Integer>{
}
