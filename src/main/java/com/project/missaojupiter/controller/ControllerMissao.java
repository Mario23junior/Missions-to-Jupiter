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

import com.project.missaojupiter.ModelDTO.GalileoDto.MissaoDto;
import com.project.missaojupiter.service.ServiceMissao;

@RestController
@RequestMapping("/project/missao/api/v1/")
public class ControllerMissao {
    
	private ServiceMissao service;
	
	public ControllerMissao(ServiceMissao service) {
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<MissaoDto> saveMissao(@RequestBody MissaoDto missaoDto) {
		return service.save(missaoDto);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<MissaoDto> listId(@PathVariable Long id) {
		return service.listId(id);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<MissaoDto> update(@PathVariable Long id , @RequestBody MissaoDto missaoDto) {
		return service.updateData(id, missaoDto);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<MissaoDto> deleteData(@PathVariable Long id) {
		return service.delete(id);
	}
}
