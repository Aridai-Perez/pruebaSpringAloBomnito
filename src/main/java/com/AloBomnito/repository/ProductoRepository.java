package com.AloBomnito.repository;

import org.springframework.stereotype.*;

import com.AloBomnito.modelos.Producto;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
