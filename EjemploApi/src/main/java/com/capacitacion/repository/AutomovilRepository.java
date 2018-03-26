package com.capacitacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capacitacion.model.Automovil;


@Repository
public interface AutomovilRepository extends JpaRepository<Automovil, Long>  {

}
