package com.project.missaojupiter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.missaojupiter.model.pinner.Pinner;

@Repository
public interface PinnerRepository extends JpaRepository<Pinner, Long>{

}
