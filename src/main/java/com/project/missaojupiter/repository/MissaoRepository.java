package com.project.missaojupiter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.missaojupiter.model.Galileo.Missao;

@Repository
public interface MissaoRepository extends JpaRepository<Missao, Long>{

	Missao findByDestino(String nome);
}
