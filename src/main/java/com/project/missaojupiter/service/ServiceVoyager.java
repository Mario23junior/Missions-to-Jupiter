package com.project.missaojupiter.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.missaojupiter.ModelDTO.voyagerDto.VoyagerDto;
import com.project.missaojupiter.exceptions.ReturnErrorMessage;
import com.project.missaojupiter.model.voyager.Voyager;
import com.project.missaojupiter.repository.VoyagerRepository;

@Service
public class ServiceVoyager {
   
	private VoyagerRepository voyagerRepository;
	private ModelMapper mapper;
	

	public ServiceVoyager(VoyagerRepository voyagerRepository, ModelMapper mapper) {
 		this.voyagerRepository = voyagerRepository;
		this.mapper = mapper;
	}

	public ResponseEntity<VoyagerDto> save(VoyagerDto voyagerDto) {
		DonLetValueBeDuplicated(voyagerDto);
		Voyager modelSave = bodysave(mapper.map(voyagerDto, Voyager.class));
		return ResponseEntity
				   .status(HttpStatus.OK)
				   .body(mapper.map(modelSave, VoyagerDto.class));
	}
	
	public Voyager bodysave(Voyager voyager) {
 		return voyagerRepository.save(voyager); 
	}
	

	public void DonLetValueBeDuplicated(VoyagerDto voyagerDto) {	
		Voyager dtoModel = mapper.map(voyagerDto, Voyager.class);
		Voyager buscaJuno = voyagerRepository.findByNome(dtoModel.getNome());
		if(buscaJuno != null && buscaJuno.getId() != dtoModel.getId()) {
			throw new ReturnErrorMessage("a sonda %s já se encontra cadastrada, "
					+ "por favor insira valores validos",dtoModel.getNome());
		}
	}
	
	public ResponseEntity<VoyagerDto> listId(Long id) {
		Optional<Voyager> listId = voyagerRepository.findById(id);
		if(listId.isPresent()) {
			return ResponseEntity.ok(mapper.map(listId.get(), VoyagerDto.class));
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	public ResponseEntity<VoyagerDto> updateData(Long id, VoyagerDto voyagerDto) {
  		Optional<Voyager> capturarData = voyagerRepository.findById(id);
		if(capturarData.isPresent()) {
			Voyager sondaInfo = capturarData.get();
			sondaInfo.setNome(voyagerDto.getNome());
			sondaInfo.setDestino(voyagerDto.getDestino());
			sondaInfo.setDataLancamento(voyagerDto.getDataLancamento());
			sondaInfo.setTipo(voyagerDto.getTipo());
			sondaInfo.setTripulada(voyagerDto.isTripulada());

 			voyagerRepository.save(sondaInfo);
			return ResponseEntity.ok(mapper.map(sondaInfo, VoyagerDto.class));
 		} else {
 			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
 		}
	}
		
		public ResponseEntity<VoyagerDto> delete(Long id) {
			Optional<Voyager> findId = voyagerRepository.findById(id);
			if(findId.isPresent()) {
				voyagerRepository.delete(findId.get());
				return new ResponseEntity<>(HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
	}

	
	
	
}
