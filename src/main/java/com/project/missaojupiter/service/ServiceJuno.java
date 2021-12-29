package com.project.missaojupiter.service;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.missaojupiter.ModelDTO.JunoDto.JunoDto;
import com.project.missaojupiter.model.Juno.Juno;
import com.project.missaojupiter.repository.JunoRepository;

@Service
public class ServiceJuno {
    
	private ModelMapper mapper;
	private JunoRepository junoRepository;
	
	public ServiceJuno(ModelMapper mapper, JunoRepository junoRepository) {
		this.mapper = mapper;
		this.junoRepository = junoRepository;
	}
	
	public ResponseEntity<JunoDto> save(JunoDto junoDto) {
		Juno modelSave = bodysave(mapper.map(junoDto, Juno.class));
		return ResponseEntity
				   .status(HttpStatus.OK)
				   .body(mapper.map(modelSave, JunoDto.class));
	}
	
	public Juno bodysave(Juno juno) {
		return junoRepository.save(juno); 
	}
	
}
