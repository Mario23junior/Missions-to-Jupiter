package com.project.missaojupiter.ModelDTO.voyagerDto;

import java.util.Date;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.project.missaojupiter.ModelDTO.GalileoDto.GalileoDto;

public class VoyagerDto {

	private Long id;

	private String nome;
	private String destino;
	
	@Column(name = "data_lancamento")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataLancamento;
	
	private String tipo;
	private boolean tripulada;
	
	private GalileoDto galileoDto;

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

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isTripulada() {
		return tripulada;
	}

	public void setTripulada(boolean tripulada) {
		this.tripulada = tripulada;
	}

	public GalileoDto getGalileoDto() {
		return galileoDto;
	}

	public void setGalileoDto(GalileoDto galileoDto) {
		this.galileoDto = galileoDto;
	}

	@Override
	public String toString() {
		return "VoyagerDto [id=" + id + ", nome=" + nome + ", destino=" + destino + ", dataLancamento=" + dataLancamento
				+ ", tipo=" + tipo + ", tripulada=" + tripulada + ", galileoDto=" + galileoDto + "]";
	}
	
	
	
}
