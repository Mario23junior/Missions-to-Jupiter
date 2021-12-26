package com.project.missaojupiter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.missaojupiter.model.Galileo.Galileo;

@Repository
public interface GalileoRepository extends JpaRepository<Galileo, Long>{
  
	Galileo findByNome(String nome);

}
