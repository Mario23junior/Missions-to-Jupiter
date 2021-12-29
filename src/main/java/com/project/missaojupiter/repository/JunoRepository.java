package com.project.missaojupiter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.missaojupiter.model.Juno.Juno;

@Repository
public interface JunoRepository extends JpaRepository<Juno, Long>{

	Juno findByNome(String nome);

}
