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

import com.project.missaojupiter.ModelDTO.voyagerDto.VoyagerDto;
import com.project.missaojupiter.service.ServiceVoyager;

@RestController
@RequestMapping("/project/voyager/api/v1/")
public class ControllerVoyager {
   
	private ServiceVoyager service;
	
	public ControllerVoyager(ServiceVoyager service) {
		this.service = service;
 	}
	
	@PostMapping
	public ResponseEntity<VoyagerDto> saveVoya(@RequestBody VoyagerDto voyagerDto) {
		return service.save(voyagerDto);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<VoyagerDto> list(@PathVariable Long id){
		return service.listId(id);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<VoyagerDto> update(@PathVariable Long id, @RequestBody VoyagerDto voyagerDto) {
		return service.updateData(id, voyagerDto);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<VoyagerDto> deleteVoya(@PathVariable Long id){
		return service.delete(id);
	}
}
