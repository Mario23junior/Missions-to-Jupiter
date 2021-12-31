package com.project.missaojupiter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.missaojupiter.model.voyager.Voyager;

@Repository
public interface VoyagerRepository extends JpaRepository<Voyager, Long>{

	Voyager findByNome(String nome);

}
