package com.AloBomnito.repository;

import com.AloBomnito.modelos.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredienteRepository extends JpaRepository <Ingrediente, Integer>{
}
