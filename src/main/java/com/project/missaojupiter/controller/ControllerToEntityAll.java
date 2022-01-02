package com.project.missaojupiter.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.missaojupiter.ModelDTO.GalileoDto.GalileoDto;
import com.project.missaojupiter.service.ServiceToEntityAllResponse;

@RestController
@RequestMapping("/project/mission/jupiter/api/v1/")
public class ControllerToEntityAll {
   
	private ServiceToEntityAllResponse service;

	public ControllerToEntityAll(ServiceToEntityAllResponse service) {
 		this.service = service;
	}
 
	@GetMapping
	public List<GalileoDto> listAllResponse(){
		return service.listAllbyData();
 	}
}
