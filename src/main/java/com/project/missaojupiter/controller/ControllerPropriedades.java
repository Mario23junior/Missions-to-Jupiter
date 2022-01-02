package com.project.missaojupiter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.missaojupiter.ModelDTO.GalileoDto.PropriedadesDto;
import com.project.missaojupiter.service.ServicePropriedade;

@RestController
@RequestMapping("/project/propriedades/api/v1/")
public class ControllerPropriedades {
   
private ServicePropriedade service;
	
	public ControllerPropriedades(ServicePropriedade service) {
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<PropriedadesDto> save(@RequestBody PropriedadesDto propriedadesDto) {
		return service.saveBody(propriedadesDto);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<PropriedadesDto> list(@PathVariable Long id){
		return service.listId(id);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<PropriedadesDto> update(@PathVariable Long id, @RequestBody PropriedadesDto propriedadesDto) {
		return service.updateData(id, propriedadesDto);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<PropriedadesDto> delete(@PathVariable Long id){
		return service.delete(id);
	}

}  
