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
import com.project.missaojupiter.ModelDTO.PinnerDto.PinnerDto;
import com.project.missaojupiter.service.ServicePinner;

@RestController
@RequestMapping("/project/piner/api/v1/")
public class ControllerPinner {
   
	private ServicePinner service;
	
	public ControllerPinner(ServicePinner service) {
		this.service = service;
	}
	
	@PostMapping
	public ResponseEntity<PinnerDto> saveGalileo(@RequestBody PinnerDto pinnerDto) {
		return service.save(pinnerDto);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PinnerDto> list(@PathVariable Long id){
		return service.listId(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<PinnerDto> update(@PathVariable Long id, @RequestBody PinnerDto pinnerDto) {
		return service.updateData(id, pinnerDto);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<JunoDto> deleteGalie(@PathVariable Long id){
		return service.delete(id);
	}
}
