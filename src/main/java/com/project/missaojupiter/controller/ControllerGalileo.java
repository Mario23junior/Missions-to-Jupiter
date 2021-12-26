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

import com.project.missaojupiter.ModelDTO.GalileoDto.GalileoDto;
import com.project.missaojupiter.service.ServiceGalileo;

@RestController
@RequestMapping("/project/galileo/api/v1/")
public class ControllerGalileo {
   
	private ServiceGalileo service;
	
	public ControllerGalileo(ServiceGalileo service) {
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<GalileoDto> saveGalileo(@RequestBody GalileoDto galileoDto) {
		return service.save(galileoDto);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<GalileoDto> list(@PathVariable Long id){
		return service.listId(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<GalileoDto> update(@PathVariable Long id, @RequestBody GalileoDto galileoDto) {
		return service.updateIdInfo(id, galileoDto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<GalileoDto> deleteGalie(@PathVariable Long id){
		return service.delete(id);
	}

	
}













