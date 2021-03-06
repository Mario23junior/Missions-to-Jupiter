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

import com.project.missaojupiter.ModelDTO.JunoDto.JunoDto;
import com.project.missaojupiter.service.ServiceJuno;

@RestController
@RequestMapping("/project/juno/api/v1/")
public class ControllerJuno {
    
	private ServiceJuno service;
	
	public ControllerJuno(ServiceJuno service) {
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<JunoDto> saveJuno(@RequestBody JunoDto juoDto) {
		return service.save(juoDto);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<JunoDto> listId(@PathVariable Long id) {
		return service.listId(id);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<JunoDto> update(@PathVariable Long id , @RequestBody JunoDto junoDto) {
		return service.updateData(id, junoDto);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<JunoDto> deleteData(@PathVariable Long id) {
		return service.delete(id);
	}
}
