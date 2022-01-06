package com.project.missaojupiter.service;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.project.missaojupiter.ModelDTO.GalileoDto.GalileoDto;
import com.project.missaojupiter.model.Galileo.Galileo;
import com.project.missaojupiter.repository.GalileoRepository;

@Service
public class ServiceToEntityAllResponse {
   
	private GalileoRepository repository;
	private ModelMapper mapper;

	public ServiceToEntityAllResponse(GalileoRepository repository, ModelMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}

	public List<GalileoDto> listAllbyData() {
		return ((List<Galileo>)
			        	repository
				              .findAll())
				              .stream()
				              .map(this::ConvertDtoResponseAllData)
				              .collect(Collectors.toList());
				
  	}
	public GalileoDto ConvertDtoResponseAllData(Galileo galileo) {
				mapper.getConfiguration()
		          .setMatchingStrategy(MatchingStrategies.LOOSE);
		
		GalileoDto galieoDto = mapper.map(galileo, GalileoDto.class);
		saveFileDataResponse(galieoDto.toString());
	    return galieoDto;
      }
	
	public void saveFileDataResponse(String file) {
 		try {
 		 FileWriter er = new FileWriter("fileResponse/response.txt");
		 er.write(file);
		 er.close();
			
		}catch (IOException e) {
			e.printStackTrace();
 		}
	}	
} 
 
