package com.project.missaojupiter.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.missaojupiter.ModelDTO.JunoDto.JunoDto;
import com.project.missaojupiter.exceptions.ReturnErrorMessage;
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
		DonLetValueBeDuplicated(junoDto);
		Juno modelSave = bodysave(mapper.map(junoDto, Juno.class));
		return ResponseEntity
				   .status(HttpStatus.OK)
				   .body(mapper.map(modelSave, JunoDto.class));
	}
	
	public Juno bodysave(Juno juno) {
 		return junoRepository.save(juno); 
	}
	

	public void DonLetValueBeDuplicated(JunoDto junoDto) {	
		Juno dtoModel = mapper.map(junoDto, Juno.class);
 		Juno buscaJuno = junoRepository.findByNome(dtoModel.getNome());
		if(buscaJuno != null && buscaJuno.getId() != dtoModel.getId()) {
			throw new ReturnErrorMessage("a sonda %s já se encontra cadastrada, "
					+ "por favor insira valores validos",dtoModel.getNome());
		}
	}
	
	public ResponseEntity<JunoDto> listId(Long id) {
		Optional<Juno> listId = junoRepository.findById(id);
		if(listId.isPresent()) {
			return ResponseEntity.ok(mapper.map(listId.get(), JunoDto.class));
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
}
