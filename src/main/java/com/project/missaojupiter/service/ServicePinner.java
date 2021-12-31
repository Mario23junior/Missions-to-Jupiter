package com.project.missaojupiter.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.missaojupiter.ModelDTO.JunoDto.JunoDto;
import com.project.missaojupiter.ModelDTO.PinnerDto.PinnerDto;
import com.project.missaojupiter.exceptions.ReturnErrorMessage;
import com.project.missaojupiter.model.pinner.Pinner;
import com.project.missaojupiter.repository.PinnerRepository;

@Service
public class ServicePinner {
  
	private PinnerRepository pinnerRepository;
	private ModelMapper mapper;
	
	public ServicePinner(PinnerRepository pinnerRepository, ModelMapper mapper) {
 		this.pinnerRepository = pinnerRepository;
		this.mapper = mapper;
	}
	
	public ResponseEntity<PinnerDto> save(PinnerDto pinerDto) {
		DonLetValueBeDuplicated(pinerDto);
		Pinner modelSave = bodysave(mapper.map(pinerDto, Pinner.class));
		return ResponseEntity
				   .status(HttpStatus.OK)
				   .body(mapper.map(modelSave, PinnerDto.class));
	}
	
	public Pinner bodysave(Pinner pinner) {
 		return pinnerRepository.save(pinner); 
	}
	

	public void DonLetValueBeDuplicated(PinnerDto pinnerDto) {	
		Pinner dtoModel = mapper.map(pinnerDto, Pinner.class);
		Pinner buscaJuno = pinnerRepository.findByNome(dtoModel.getNome());
		if(buscaJuno != null && buscaJuno.getId() != dtoModel.getId()) {
			throw new ReturnErrorMessage("a sonda %s já se encontra cadastrada, "
					+ "por favor insira valores validos",dtoModel.getNome());
		}
	}
	
	public ResponseEntity<PinnerDto> listId(Long id) {
		Optional<Pinner> listId = pinnerRepository.findById(id);
		if(listId.isPresent()) {
			return ResponseEntity.ok(mapper.map(listId.get(), PinnerDto.class));
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	public ResponseEntity<PinnerDto> updateData(Long id, PinnerDto pinnerDto) {
  		Optional<Pinner> capturarData = pinnerRepository.findById(id);
		if(capturarData.isPresent()) {
			Pinner sondaInfo = capturarData.get();
			sondaInfo.setNome(pinnerDto.getNome());
			sondaInfo.setDescricao(pinnerDto.getDescricao());
			sondaInfo.setDataDeConstrucao(pinnerDto.getDataDeConstrucao());
			sondaInfo.setObjetivo(pinnerDto.getObjetivo());
			sondaInfo.setTripulada(pinnerDto.isTripulada());
 			pinnerRepository.save(sondaInfo);
			return ResponseEntity.ok(mapper.map(sondaInfo, PinnerDto.class));
 		} else {
 			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
 		}
	}
		

		public ResponseEntity<JunoDto> delete(Long id) {
			Optional<Pinner> findId = pinnerRepository.findById(id);
			if(findId.isPresent()) {
				pinnerRepository.delete(findId.get());
				return new ResponseEntity<>(HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
	}
	
	
}
