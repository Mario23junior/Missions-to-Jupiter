package com.project.missaojupiter.ModelDTO.GalileoDto;

import java.util.List;

import com.project.missaojupiter.ModelDTO.JunoDto.JunoDto;
import com.project.missaojupiter.ModelDTO.PinnerDto.PinnerDto;
import com.project.missaojupiter.ModelDTO.voyagerDto.VoyagerDto;

public class GalileoDto {

	private Long id;
	private String nome;
	private String descricao;
	private String indentificacao;
	private String duracaoDaMiscao;

	private List<MissaoDto> missaosDto;
	private List<PropriedadesDto> propriedadesDtos;
	private List<JunoDto> junoDto;
	private List<PinnerDto> pinnerDtos;
	private List<VoyagerDto> voyagerDtos;

	public GalileoDto() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIndentificacao() {
		return indentificacao;
	}

	public void setIndentificacao(String indentificacao) {
		this.indentificacao = indentificacao;
	}

	public String getDuracaoDaMiscao() {
		return duracaoDaMiscao;
	}

	public void setDuracaoDaMiscao(String duracaoDaMiscao) {
		this.duracaoDaMiscao = duracaoDaMiscao;
	}

	public List<MissaoDto> getMissaosDto() {
		return missaosDto;
	}

	public void setMissaosDto(List<MissaoDto> missaosDto) {
		this.missaosDto = missaosDto;
	}

	public List<PropriedadesDto> getPropriedadesDtos() {
		return propriedadesDtos;
	}

	public void setPropriedadesDtos(List<PropriedadesDto> propriedadesDtos) {
		this.propriedadesDtos = propriedadesDtos;
	}

	public List<JunoDto> getJunoDto() {
		return junoDto;
	}

	public void setJunoDto(List<JunoDto> junoDto) {
		this.junoDto = junoDto;
	}

	public List<PinnerDto> getPinnerDtos() {
		return pinnerDtos;
	}

	public void setPinnerDtos(List<PinnerDto> pinnerDtos) {
		this.pinnerDtos = pinnerDtos;
	}

	public List<VoyagerDto> getVoyagerDtos() {
		return voyagerDtos;
	}

	public void setVoyagerDtos(List<VoyagerDto> voyagerDtos) {
		this.voyagerDtos = voyagerDtos;
	}

	@Override
	public String toString() {
		return "GalileoDto [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", indentificacao="
				+ indentificacao + ", duracaoDaMiscao=" + duracaoDaMiscao + ", missaosDto=" + missaosDto
				+ ", propriedadesDtos=" + propriedadesDtos + ", junoDto=" + junoDto + ", pinnerDtos=" + pinnerDtos
				+ ", voyagerDtos=" + voyagerDtos + "]";
	}

	

}
