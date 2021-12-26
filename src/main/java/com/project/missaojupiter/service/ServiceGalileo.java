package com.project.missaojupiter.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.missaojupiter.ModelDTO.GalileoDto.GalileoDto;
import com.project.missaojupiter.exceptions.ReturnErrorMessage;
import com.project.missaojupiter.model.Galileo.Galileo;
import com.project.missaojupiter.repository.GalileoRepository;

@Service
public class ServiceGalileo {
   
	private ModelMapper mapper;
	private GalileoRepository galileoRepository;
	
	public ServiceGalileo(ModelMapper mapper, GalileoRepository galileoRepository) {
		this.mapper = mapper;
		this.galileoRepository = galileoRepository;
 	}
	
	public ResponseEntity<GalileoDto> save(GalileoDto galielDto) {
		Galileo savebody = saveRes(mapper.map(galielDto, Galileo.class));
 		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(mapper.map(savebody, GalileoDto.class));
	}
	
	public Galileo saveRes(Galileo galileo) {
	DonLetValueBeDuplicated(galileo);
	   Galileo save = galileoRepository.save(galileo);
	   return save;
	}
	
	public ResponseEntity<GalileoDto> listId(@PathVariable Long id) {
		Optional<Galileo> listId = galileoRepository.findById(id);
		if(listId.isPresent()) {
			return ResponseEntity.ok(mapper.map(listId.get(), GalileoDto.class));
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	public ResponseEntity<GalileoDto> updateIdInfo(Long id,GalileoDto galileoDto) {
		DonLetValueBeDuplicated(galileoDto);
		Optional<Galileo> updateData = galileoRepository.findById(id);
 		if(updateData.isPresent()) {
			Galileo dataGali = updateData.get();
			dataGali.setNome(galileoDto.getNome());
			dataGali.setDescricao(galileoDto.getDescricao());
			dataGali.setIndentificacao(galileoDto.getIndentificacao());
			dataGali.setDuracaoDaMiscao(galileoDto.getDuracaoDaMiscao());
			galileoRepository.save(dataGali);
			return ResponseEntity.ok(mapper.map(dataGali, GalileoDto.class));
			
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	
	public ResponseEntity<GalileoDto> delete(Long id) {
		Optional<Galileo> findId = galileoRepository.findById(id);
		if(findId.isPresent()) {
			galileoRepository.delete(findId.get());
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
	}
	
	
	public void DonLetValueBeDuplicated(Galileo galileo) {	
 		Galileo buscaGalie = galileoRepository.findByNome(galileo.getNome());
		if(buscaGalie != null && buscaGalie.getId() != galileo.getId()) {
			throw new ReturnErrorMessage("a sonda %s já se encontra cadastrado, "
					+ "por favor insira valores validos",galileo.getNome());
		}
	}
	
	public void DonLetValueBeDuplicated(GalileoDto galileoDto) {	
		Galileo dtoModel = mapper.map(galileoDto, Galileo.class);
 		Galileo buscaGalie = galileoRepository.findByNome(dtoModel.getNome());
		if(buscaGalie != null && buscaGalie.getId() != dtoModel.getId()) {
			throw new ReturnErrorMessage("a sonda %s já se encontra atualizada, "
					+ "por favor insira valores validos",dtoModel.getNome());
		}
	}
}











