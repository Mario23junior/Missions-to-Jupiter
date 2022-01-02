package com.project.missaojupiter.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.missaojupiter.ModelDTO.GalileoDto.PropriedadesDto;
import com.project.missaojupiter.exceptions.ReturnErrorMessage;
import com.project.missaojupiter.model.Galileo.Propriedades;
import com.project.missaojupiter.repository.PropriedadesRepository;

@Service
public class ServicePropriedade {
    
	private PropriedadesRepository propriedadesRepository;
	private ModelMapper mapper;
	
	public ServicePropriedade(PropriedadesRepository propriedadesRepository, ModelMapper mapper) {
 		this.propriedadesRepository = propriedadesRepository;
		this.mapper = mapper;
	}

	public ResponseEntity<PropriedadesDto> saveBody(PropriedadesDto proriDto) {
		DonLetValueBeDuplicated(proriDto);
		Propriedades modelSave = bodysave(mapper.map(proriDto, Propriedades.class));
		return ResponseEntity
				   .status(HttpStatus.OK)
				   .body(mapper.map(modelSave, PropriedadesDto.class));
	}
	
	public Propriedades bodysave(Propriedades propriedades) {
 		return propriedadesRepository.save(propriedades); 
	}
	
	public void DonLetValueBeDuplicated(PropriedadesDto proriDto) {	
		Propriedades dtoModel = mapper.map(proriDto, Propriedades.class);
		Propriedades buscaJuno = propriedadesRepository.findByFabricante(dtoModel.getFabricante() );
		if(buscaJuno != null && buscaJuno.getId() != dtoModel.getId()) {
			throw new ReturnErrorMessage("a sonda %s já se encontra cadastrada, "
					+ "por favor insira valores validos",dtoModel.getFabricante());
		}
	}
	
	public ResponseEntity<PropriedadesDto> listId(Long id) {
		Optional<Propriedades> listId = propriedadesRepository.findById(id);
		if(listId.isPresent()) {
			return ResponseEntity.ok(mapper.map(listId.get(), PropriedadesDto.class));
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	public ResponseEntity<PropriedadesDto> updateData(Long id, PropriedadesDto prioriDto) {
  		Optional<Propriedades> capturarData = propriedadesRepository.findById(id);
		if(capturarData.isPresent()) {
			Propriedades sondaInfo = capturarData.get();
			sondaInfo.setFabricante(prioriDto.getFabricante());
			sondaInfo.setOrbitador(prioriDto.getOrbitador());
			sondaInfo.setAterrissador(prioriDto.getAterrissador());
			sondaInfo.setAterrissador(prioriDto.getAterrissador());
			sondaInfo.setGeradorDeEnergia(prioriDto.getGeradorDeEnergia());
			sondaInfo.setMassaDeCargaUtil(prioriDto.getMassaDeCargaUtil());
            propriedadesRepository.save(sondaInfo);
			return ResponseEntity.ok(mapper.map(sondaInfo, PropriedadesDto.class));
 		} else {
 			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
 		}
	}
		

		public ResponseEntity<PropriedadesDto> delete(Long id) {
			Optional<Propriedades> findId = propriedadesRepository.findById(id);
			if(findId.isPresent()) {
				propriedadesRepository.delete(findId.get());
				return new ResponseEntity<>(HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
	}
	
}
