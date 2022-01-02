package com.project.missaojupiter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.missaojupiter.model.Galileo.Propriedades;

@Repository
public interface PropriedadesRepository extends JpaRepository<Propriedades, Long>{

	Propriedades findByFabricante(String fabricante);

}
