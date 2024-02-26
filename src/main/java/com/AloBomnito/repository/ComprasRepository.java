package com.AloBomnito.repository;

import com.AloBomnito.modelos.Compras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComprasRepository extends JpaRepository <Compras, Integer>{
}
