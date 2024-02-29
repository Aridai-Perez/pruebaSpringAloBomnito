package com.AloBomnito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AloBomnito.modelos.Compras;

@Repository
public interface ComprasRepository extends JpaRepository <Compras, Integer>{
}
