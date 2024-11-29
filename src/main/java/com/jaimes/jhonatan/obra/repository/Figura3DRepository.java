package com.jaimes.jhonatan.obra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jaimes.jhonatan.obra.models.Figura3D;

@Repository
public interface Figura3DRepository extends JpaRepository <Figura3D, Integer>{
    
}
