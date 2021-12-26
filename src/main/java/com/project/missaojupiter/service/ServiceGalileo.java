package com.project.missaojupiter.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.missaojupiter.ModelDTO.GalileoDto.GalileoDto;
import com.project.missaojupiter.model.Galileo.Galileo;
import com.project.missaojupiter.repository.GalileoRepository;

@Service
public class ServiceGalileo {
   
	private ModelMapper mapper;
	private GalileoRepository galileoRepository;
	
	public ServiceGalileo(ModelMapper mapper, GalileoRepository galileoRepository) {
		this.mapper = mapper;
		this.galileoRepository = galileoRepository;
 	}
	
	public ResponseEntity<GalileoDto> save(GalileoDto galielDto) {
		Galileo savebody = saveRes(mapper.map(galielDto, Galileo.class));
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(mapper.map(savebody, GalileoDto.class));
	}
	
	public Galileo saveRes(Galileo galileo) {
	   Galileo save = galileoRepository.save(galileo);
	   return save;
	}
	
	public ResponseEntity<GalileoDto> listId(@PathVariable Long id) {
		Optional<Galileo> listId = galileoRepository.findById(id);
		if(listId.isPresent()) {
			return ResponseEntity.ok(mapper.map(listId.get(), GalileoDto.class));
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	
}