package com.project.missaojupiter.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.missaojupiter.ModelDTO.GalileoDto.MissaoDto;
import com.project.missaojupiter.exceptions.ReturnErrorMessage;
import com.project.missaojupiter.model.Galileo.Missao;
import com.project.missaojupiter.repository.MissaoRepository;

@Service
public class ServiceMissao {
  
	private MissaoRepository missaoRepository;
	private ModelMapper mapper;
	
	public ServiceMissao(MissaoRepository misaoRepository, ModelMapper mapper) {
		this.mapper = mapper;
		this.missaoRepository = misaoRepository;
 	}
	
	public ResponseEntity<MissaoDto> save(MissaoDto missaoDto) {
		DonLetValueBeDuplicated(missaoDto);
		Missao modelSave = bodysave(mapper.map(missaoDto, Missao.class));
		return ResponseEntity
				   .status(HttpStatus.OK)
				   .body(mapper.map(modelSave, MissaoDto.class));
	}
	
	public Missao bodysave(Missao missao) {
 		return missaoRepository.save(missao); 
	}
	

	public void DonLetValueBeDuplicated(MissaoDto missaoDto) {	
		Missao dtoModel = mapper.map(missaoDto, Missao.class);
		Missao buscaJuno = missaoRepository.findByDestino(dtoModel.getDestino());
		if(buscaJuno != null && buscaJuno.getId() != dtoModel.getId()) {
			throw new ReturnErrorMessage("a sonda %s já se encontra cadastrada, "
					+ "por favor insira valores validos",dtoModel.getDestino());
		}
	}
	
	public ResponseEntity<MissaoDto> listId(Long id) {
		Optional<Missao> listId = missaoRepository.findById(id);
		if(listId.isPresent()) {
			return ResponseEntity.ok(mapper.map(listId.get(), MissaoDto.class));
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	public ResponseEntity<MissaoDto> updateData(Long id, MissaoDto missaoDto) {
  		Optional<Missao> capturarData = missaoRepository.findById(id);
		if(capturarData.isPresent()) {
			Missao sondaInfo = capturarData.get();
			sondaInfo.setDestino(missaoDto.getDestino());
			sondaInfo.setVeiculoDeLancamento(missaoDto.getVeiculoDeLancamento());
			sondaInfo.setDataDeAterrissagem(missaoDto.getDataDeAterrissagem());
			sondaInfo.setDataDeLacamento(missaoDto.getDataDeLacamento());		 
			missaoRepository.save(sondaInfo);
			return ResponseEntity.ok(mapper.map(sondaInfo, MissaoDto.class));
 		} else {
 			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
 		}
	}
		

		public ResponseEntity<MissaoDto> delete(Long id) {
			Optional<Missao> findId = missaoRepository.findById(id);
			if(findId.isPresent()) {
				missaoRepository.delete(findId.get());
				return new ResponseEntity<>(HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
	}
	
}
